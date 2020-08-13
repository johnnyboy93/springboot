FROM openjdk:8
ADD target/mybatis.jar mybatis.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "mybatis.jar"]