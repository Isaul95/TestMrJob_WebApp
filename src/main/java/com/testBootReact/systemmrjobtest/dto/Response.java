package com.testBootReact.systemmrjobtest.dto;

import java.util.List;

public class Response {

    private int Code;
    private String Descripcion;
    private List<?> Result;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public List<?> getResult() {
        return Result;
    }

    public void setResult(List<?> result) {
        Result = result;
    }

    /**
     *  -----   Constructures  -----
     * @param code
     * @param descripcion
     */
    public Response(int code, String descripcion) {
        Code = code;
        Descripcion = descripcion;
    }

    public Response() {
    }
}
