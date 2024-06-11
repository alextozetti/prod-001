#!/bin/bash

# Rodar as imagens criadas localmente
#docker-compose down
#docker build -t backend-prod:latest ./backend
#docker build -t frontend-prod:latest ./frontend
#docker-compose up --build --force-recreate --remove-orphans

# Baixar as imagens do docker hub e rodar
 docker-compose down
 docker-compose pull
 docker-compose up --build --force-recreate --remove-orphans
