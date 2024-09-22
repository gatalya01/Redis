# Указываем базовый образ OpenJDK
FROM openjdk:19-jdk-slim

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем скомпилированный JAR файл в контейнер
COPY build/libs/integration-app-0.0.1-SNAPSHOT.jar app.jar

# Устанавливаем переменные окружения для Redis
ENV SPRING_REDIS_HOST=redis
ENV SPRING_REDIS_PORT=6379

# Открываем порт 8080 для приложения
EXPOSE 8080

# Запуск приложения
ENTRYPOINT ["java", "-jar", "app.jar"]