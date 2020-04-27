FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY  --from=maven_build /tmp/target/*.jar /data/app.jar

CMD java -jar /data/app.jar


