FROM openjdk:17

WORKDIR /app

COPY target/*.jar /app/controle-despesas.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/controle-despesas.jar"]

