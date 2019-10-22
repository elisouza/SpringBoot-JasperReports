# SpringBoot-JasperReports

SpringBoot + JasperReports
Aplicação Spring Boot com suporte a impressão de Relatórios em Jasper Reports

Ferramentas Utilizadas
Java 8
JasperSoft Studio Community 6.0
IDE Intellij

Get Start
O projeto esta configurado para usar banco de dados MySQL, crie uma base de dados chamada springjasper e execute a classe App.java.

Os dados de conexão podem ser alterados no application.properties:

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/mysql?useTimezone=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.show-sql=true

