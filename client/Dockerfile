FROM node:alpine

ENV PROJECT_ENV production
ENV NODE_ENV production


WORKDIR /code
ADD . /code
RUN npm install && npm run build && npm install -g http-server
EXPOSE 3000

CMD http-server ./build -p 3000


