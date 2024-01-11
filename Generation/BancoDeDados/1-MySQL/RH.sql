create database db_rh;

use db_rh;

create table funcionarios(
id bigint auto_increment,
nome varchar(225) not null,
idade int,
salario decimal (8,2),
curso varchar (225),
primary key (id)
);
insert into funcionarios(nome, idade, salario, curso) values ("Cleber", 32, 2000.50, "sem curso");
insert into funcionarios(nome, idade, salario, curso) values ("Clebera", 35, 1200.50, "com curso");
insert into funcionarios(nome, idade, salario, curso) values ("Clebero", 39, 100.50, "com curso superior");
insert into funcionarios(nome, idade, salario, curso) values ("Cleberu", 40, 1200.50, "com curso");
insert into funcionarios(nome, idade, salario, curso) values ("Cleberi", 50, 100.50, "com curso superior");


select * from funcionarios where salario > 200;
select * from funcionarios where salario < 2000;

alter table funcionarios add endereço varchar(255);
update funcionarios set endereço = "Itaquera" where id = 1;

