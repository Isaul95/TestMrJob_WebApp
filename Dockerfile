FROM amazoncorretto:11-alpine-jdk
MAINTAINER MRJOB
COPY target/system-mrjob-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]