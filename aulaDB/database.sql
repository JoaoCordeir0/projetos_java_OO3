create database aula_database;
use aula_database;

create table Aluno(
    id int primary key auto_increment not null,
    nome nvarchar(255),
    ra nvarchar(7)
);