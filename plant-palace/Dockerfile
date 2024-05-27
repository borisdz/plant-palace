FROM openjdk:17-jdk
LABEL authors="Boris Djotov"
WORKDIR /app
COPY target/*.jar /app/plant_palace-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app/plant_palace-0.0.1-SNAPSHOT.jar"]