![Diagrama_Controle_Despesa-Página-2.jpg](src%2Fmain%2Fresources%2Fimages%2FDiagrama_Controle_Despesa-P%C3%A1gina-2.jpg)

## Comandos Docker
mvn clean package -DskipTests

<h5> Para gerar a imagem do docker </h5>
docker build -t [nome do container] .

docker run -p8080:8080 [imagem]
