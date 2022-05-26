FROM maven:3.8.5-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17
COPY --from=build /home/app/target/kotlin-scripting-demo-1.0-SNAPSHOT-jar-with-dependencies.jar /home/app/kotlin-scripting-demo.jar
WORKDIR /home/app
ENTRYPOINT ["java","-jar","kotlin-scripting-demo.jar"]
