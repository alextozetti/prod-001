FROM node:18

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar os arquivos de configuração do npm
COPY package*.json ./

# Instalar as dependências do projeto
RUN npm install

# Copiar todos os arquivos do projeto para o diretório de trabalho no contêiner
COPY . .

# Buildar o projeto
RUN npm run build

# Instalar o servidor de arquivos estáticos
RUN npm install -g serve

# Comando para rodar a aplicação
CMD ["serve", "-s", "out", "-l", "3000"]

# Comando para rodar a aplicação
#CMD ["npm", "run", "start"]
