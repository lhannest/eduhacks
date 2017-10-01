FROM openjdk:8-jdk-alpine
COPY build/libs /home/
ENTRYPOINT java -jar *.jar