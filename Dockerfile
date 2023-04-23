FROM amazoncorretto:11-alpine-jdk
MAINTAINER MRJOB
COPY target/system-mrjob-test.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]