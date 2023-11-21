FROM maven:3.8.4-openjdk-17-slim AS builder

COPY . /usr/src/parser

RUN cd /usr/src/parser && \
    mvn clean install

FROM openjdk:17-slim

COPY --from=builder /usr/src/parser/target/ODX_D_Parameter_Parser-1.0-SNAPSHOT.jar /usr/bin/api.jar

CMD ["java", "-jar", "/usr/bin/api.jar"]

#Edit endpoints/functionality in ParserMapping
#docker build -t [ContainerName] .
#docker run -d -p 8080:8080 [ContainerName]
#Use postman and test endpoints using localhost:8080/parser
