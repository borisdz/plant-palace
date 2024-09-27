FROM node:20 as node

WORKDIR /app

COPY ..

WORKDIR /app/js

RUN npm install -g @angular/cli
RUN npm install
RUN npm build
