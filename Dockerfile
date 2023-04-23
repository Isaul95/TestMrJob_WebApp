FROM amazoncorretto:11-alpine-jdk
MAINTAINER MRJOB
COPY out/artifacts/mrjob_jar/mrjob.jar  mrjob-app.jar
ENTRYPOINT ["java","-jar","/mrjob-app.jar"]