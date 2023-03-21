create database aula_database_java;
use aula_database_java;

create table Aluno(
    id int primary key auto_increment not null,
    nome nvarchar(255),
    ra nvarchar(7)
);
