create database agencia_bancaria;
use agencia_bancaria;

create table cliente(
	cpf varchar(15) primary key,
    nome varchar(255)
);

insert into cliente (cpf, nome) values ('123.456.789-09', 'João Victor Cordeiro');
insert into cliente (cpf, nome) values ('321.574.789-09', 'Lucas Gabryel');
insert into cliente (cpf, nome) values ('456.456.342-09', 'Henrique Magnolia');