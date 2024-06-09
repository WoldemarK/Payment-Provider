FROM bellsoft/liberica-openjdk-alpine-musl
COPY ./target/PaymentProvider-1.0.0-SNAPSHOT.jar .
CMD ["java","-jar","PaymentProvider-1.0.0-SNAPSHOT.jar"]