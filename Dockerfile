FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw -DskipTests package

ENV PORT=8080
ENV QUARKUS_HTTP_PORT=8080
ENV QUARKUS_HTTP_HOST=0.0.0.0

CMD ["java", "-jar", "target/quarkus-app/quarkus-run.jar"]
