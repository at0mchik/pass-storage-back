FROM bellsoft/liberica-openjdk-alpine:18.0.2.1-1
WORKDIR /app
Copy atom/build/libs/atom-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
