FROM openjdk:8
ADD target/countrypower.war countrypower.war
EXPOSE 8084
ENTRYPOINT ["java","-jar","countrypower.war"]