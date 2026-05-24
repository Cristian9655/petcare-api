FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY . /app

RUN mvn clean package -DskipTests

RUN adduser --disabled-password --gecos "" \
    --home /home/appuser \
    --shell /bin/bash appuser \
    && chown -R appuser:appuser /app /home/appuser

USER appuser

EXPOSE 8080

CMD ["java", "-jar", "target/petcare-api-0.0.1-SNAPSHOT.jar"]