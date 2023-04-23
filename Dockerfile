FROM amazoncorretto:11-alpine-jdk // De que imagen de java partimos
MAINTAINER MRJOB // Quien es el dueño del proyecto
// Va copiar de nuestra maquina el empaqueta y lo va a subir a github
COPY out/artifacts/mrjob_jar/mrjob.jar  mrjob-app.jar
// Una vez que se crea la instancia del container le va a decir es lo primero a ejecutar
ENTRYPOINT ["java","-jar","/mrjob-app.jar"]
