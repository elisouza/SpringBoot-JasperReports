# SpringBoot-JasperReports

SpringBoot + JasperReports
Aplicação Spring Boot com suporte a impressão de Relatórios em Jasper Reports

Get Start
O projeto esta configurado para usar banco de dados MySQL, crie uma base de dados chamada springjasper e execute a classe App.java.

Os dados de conexão podem ser alterados no application.properties:

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/mysql?useTimezone=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.show-sql=true


Script MySQl

use mysql;

DROP TABLE IF EXISTS emp;

CREATE TABLE emp (
 empno int AUTO_INCREMENT PRIMARY KEY,
  ename varchar(10) default NULL,
  job varchar(9) default NULL,
  mgr decimal(4,0) default NULL,
  hiredate date default NULL,
  sal decimal(7,2) default NULL,
  comm decimal(7,2) default NULL,
  deptno decimal(2,0) default NULL
);

DROP TABLE IF EXISTS dept;

CREATE TABLE dept (
  deptno decimal(2,0) default NULL,
  dname varchar(14) default NULL,
  loc varchar(13) default NULL
);
SELECT * FROM EMP;

INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES ('0011','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES ('0012','MEIRE','VENDEDORA','7698','1981-02-20','1600.00','300.00','30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0013','MONICA','VENDEDORA','7698','1981-02-22','1250.00','500.00','30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0014','JOANA','GERENTE','7839','1981-04-02','2975.00',1000.00,'20');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0015','PATRICIA','VENDEDORA','7698','1981-09-28','1250.00','1400.00','30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0016','ELAINE','GERENTE','7839','1981-05-01','2850.00',20000.00,'30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0017','MIRIAM','GERENTE','7839','1981-06-09','2450.00',40000.00,'10');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES ('0018','MARTA','ANALISTA','7566','1982-12-09','3000.00',NULL,'20');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0019','KATARINA','PRESIDENTE',NULL,'1981-11-17','5000.00',NULL,'10');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0110','DORIS','VENDEDORA','7698','1981-09-08','1500.00','0.00','30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0111','EVA','VENDEDORA','7788','1983-01-12','1100.00',NULL,'20');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0112','ROBERTA','ANALISTA','7698','1981-12-03','950.00',NULL,'30');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0113','FERNANDA','ANALISTA','7566','1981-12-03','3000.00',NULL,'20');
INSERT INTO emp (empno, ename, job , mgr, hiredate, sal, comm, deptno ) VALUES  ('0114','JAQUELINE','DIRETORA','7782','1982-01-23','1300.00',NULL,'10');

INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
INSERT INTO dept VALUES ('30','SALES','CHICAGO');
INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');

select * from emp;
