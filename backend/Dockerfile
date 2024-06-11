FROM maven:3.8-openjdk-17 AS build

# Copia o código fonte para o contêiner
WORKDIR /app

COPY . .

# Define o diretório de trabalho

# Compila a aplicação
RUN mvn clean install -DskipTests

# Imagem final
# Estágio 2: Executar a aplicação
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copia o jar construído no estágio anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 8080
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
