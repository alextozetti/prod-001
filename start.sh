#!/bin/bash

docker-compose down
docker build -t backend-prod:latest ./backend
#docker build -t frontend-prod:latest ./frontend
docker-compose up --build --force-recreate --remove-orphans
