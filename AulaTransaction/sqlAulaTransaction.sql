use aula_database_java;

create table conta(
	idConta int primary key auto_increment not null,
    numeroConta varchar(45) not null,
    agencia varchar(45) not null,
    saldo double not null
);

insert into conta (numeroConta, agencia, saldo) values ("2135-67", "002", 300000.00);
insert into conta (numeroConta, agencia, saldo) values ("2688-56", "001", 50000.00);
