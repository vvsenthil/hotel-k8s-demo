FROM openjdk:17
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hotel-k8s-demo.jar
ENTRYPOINT ["java","-jar","/hotel-k8s-demo.jar"]
