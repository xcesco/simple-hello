# Simple Hello REST API
This application is a simple app implements a REST api named 'hello'. Its mainly use in local (work with `localhost`).
Once app is running the REST service is available at the url:

```shell
http://localhost:8080/api/hello
```

The service documentation is available here:

```
http://localhost:8080/swagger-ui/index.html
```

## Build project
To build the project, simply execute:

```shell
./mvnw package
```

To dockerize the app

```shell
docker build -t xcesco/simple-hello:1.0.0 .
```

To do all togheter:
```shell
./mvnw package && docker build -t xcesco/simple-hello:1.0.0 .
```


## App execution in container
After build docker image, just to run app in a container named `simple-hello` run:
```shell
docker run --name simple-hello -d -p 8080:8080 xcesco/simple-hello:1.0.0
```

## API e documentazione
If everything goes ok, l'API and documentation urls are:

- http://localhost:8080/api/hello or http://localhost:8080/api/hello?name=Nando
- http://localhost:8080/swagger-ui/index.html

## Dockerhub release
To publish:

```shell
docker push xcesco/simple-hello:1.0.0
```

To compile, dockerize and publish
```shell
./mvnw clean package && \
docker build -t xcesco/simple-hello:1.0.0 . && \
docker push xcesco/simple-hello:1.0.0
```