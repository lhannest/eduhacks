FROM openjdk:8-jdk-alpine

COPY build/libs/*.jar home/app.jar

ENTRYPOINT ["java", "-jar", "home/app.jar"]