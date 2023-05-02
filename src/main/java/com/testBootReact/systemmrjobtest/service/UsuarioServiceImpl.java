package com.testBootReact.systemmrjobtest.service;

import com.testBootReact.systemmrjobtest.dto.CatUsuarioDTO;
import com.testBootReact.systemmrjobtest.dto.Response;
import com.testBootReact.systemmrjobtest.excepciones.UsuarioFoundException;
import com.testBootReact.systemmrjobtest.model.*;
import com.testBootReact.systemmrjobtest.repository.*;
import com.testBootReact.systemmrjobtest.utilerias.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private static Logger Logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);
    @Autowired
    private CatUsuarioRepository catUsuarioRepository;
    @Autowired
    private DetalleServiciosRepository detalleServiciosRepository;
    @Autowired
    private CatNegociosRepository catNegociosRepository;
    @Autowired
    private CatServiciosRepository catServiciosRepository;

    /**
     * Save user
     * @param catUsuarioDTO
     * @return
     */
    @Override
    public Response guardarUsuario(CatUsuarioDTO catUsuarioDTO) {
        Response response = new Response();
        CatUsuario newUser = new CatUsuario();
        CatServicios servAgregado = null;
        CatNegocios negoc= null;
        try {

            CatUsuario existeUsuario = catUsuarioRepository.findByUsername(catUsuarioDTO.getUsername());

            if(existeUsuario != null){
                Logger.info("El usuario ya Existe en la DB...!");
                throw new UsuarioFoundException("El usuario ya Existe en nuestra base de datos.");
            }else{

                if (catUsuarioDTO.getTipoServicioOfrece() == null || catUsuarioDTO.getTipoServicioOfrece().isEmpty() &&
                    catUsuarioDTO.getNombreNegocio() == null || catUsuarioDTO.getNombreNegocio().isEmpty()) {
                    // 1 = ROL_JOBERS = (clientes)
                    newUser.setIdRol(1L);
                }else{
                        Logger.info("El usuario en registro es un JOB.!");

                        CatServicios newServicios = new CatServicios();
                        newServicios.setTipo_servicio(catUsuarioDTO.getTipoServicioOfrece());
                           servAgregado = catServiciosRepository.save(newServicios);

                        CatNegocios negocio = new CatNegocios();
                        negocio.setIdServicios(servAgregado.getId_tipo()); /** --- agregando id_servicio en la tabla de negocios ---*/
                        negocio.setNombre(catUsuarioDTO.getNombreNegocio());
                           negoc = catNegociosRepository.save(negocio);

                    // 2 = ROL_JOB = (Prestador de servicio)
                    newUser.setIdRol(2L);
                    newUser.setIdNegocios(negoc.getId()); /** --- Isaul agregando ir negocio en la tabla de usuarios ---*/
                }

                newUser.setNombre_completo(catUsuarioDTO.getNombre_completo());
                newUser.setEmail(catUsuarioDTO.getEmail());
                newUser.setActivo(1);

                // La contraseña no esta emcriptada
                newUser.setPassword(catUsuarioDTO.getPassword());
                newUser.setTelefono(catUsuarioDTO.getTelefono());
                newUser.setUsername(catUsuarioDTO.getEmail());
                    existeUsuario = catUsuarioRepository.save(newUser);

            /**
             * Se hace el registro en table detalle_servicios para tener el servicio asociado al JOB y mostrar los servicios en Pantalla -> Mis Servicios
             */
            if (catUsuarioDTO.getTipoServicioOfrece() != null && catUsuarioDTO.getNombreNegocio() != null){
System.out.println("CONDICION -> " + catUsuarioDTO.getTipoServicioOfrece() + " ->" + catUsuarioDTO.getNombreNegocio());
                detalleServicios detServiceAgregado = new detalleServicios();
                detServiceAgregado.setId_tipo_servicio(servAgregado.getId_tipo());
                detServiceAgregado.setId_usuario(existeUsuario.getId_usuario());
                    detalleServiciosRepository.save(detServiceAgregado);
            }

                Logger.info("Usuario guardado exitosamente...!");
                response.setCode(200);
                response.setDescripcion(Messages.MSEXITO_GUADAR_USER);
            }
        } catch (Exception e){
            response.setCode(500);
            response.setDescripcion(Messages.MSERROR_GUARDAR_USER);
            Logger.error("Error en (UsuarioServiceImpl.Clas) -> guardarUsuario()");
        }
        return response;
    }



    /**
     * Get user
     * @param usuario
     * @return
     */
    @Override
    public CatUsuario obtenerUsuario(String usuario) {
        return catUsuarioRepository.findByUsername(usuario);
    }

    /**
     * Update user
     * @param usuario
     * @return
     */
    @Override
    public CatUsuario actualizarCategoria(CatUsuario usuario) {
        return catUsuarioRepository.save(usuario);
    }


    /**
     * Delete user
     * @param usuarioId
     */
    @Override
    public void eliminarUsuario(Long usuarioId) {
        catUsuarioRepository.deleteById(usuarioId);
    }

}
