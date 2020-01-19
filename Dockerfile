FROM openjdk:8-jre
COPY deploy/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]
