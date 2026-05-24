FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY . /app

ENV SPRING_PROFILES_ACTIVE=default
ENV SERVER_PORT=8080

RUN adduser --disabled-password --gecos "" \
    --home /home/appuser \
    --shell /bin/bash appuser \
    && chown -R appuser:appuser /app /home/appuser

USER appuser

EXPOSE 8080

CMD ["bash", "-c", "./mvnw clean package -DskipTests && java -jar target/*.jar"]