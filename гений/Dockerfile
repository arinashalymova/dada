# Стадия сборки
FROM gradle:latest as builder

WORKDIR /app
COPY . /app

RUN gradle build

# Стадия запуска
FROM openjdk:17-oracle

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/*.jar

EXPOSE 8000

ENTRYPOINT ["java", "-jar", "/app/*.jar"]