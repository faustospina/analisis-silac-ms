FROM openjdk:8-jdk-alpine
COPY "./build/libs/silac-producing-web-service-0.1.0.jar" "silac.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","silac.jar"]