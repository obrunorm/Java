create database db_ecommerce;

use db_ecommerce;

create table produto(
id bigint auto_increment,
nome varchar(225) not null,
codigo bigint,
preco decimal (8,2),
dataentrega varchar (225),
validade varchar (255),
primary key (id)
);
insert into produto(nome, codigo, preco, dataentrega, validade) values ("Cleber", 25145265, 100.00, "24/08", "30/09");
insert into produto(nome, codigo, preco, dataentrega, validade) values ("Clebera", 25145266, 1000.00, "25/08", "31/09");
insert into produto(nome, codigo, preco, dataentrega, validade) values ("Cleberi", 25145267, 200000.00, "26/08", "01/10");
insert into produto(nome, codigo, preco, dataentrega, validade) values ("Clebero", 25145268, 2000.00, "27/08", "02/10");
insert into produto(nome, codigo, preco, dataentrega, validade) values ("Cleberu", 25145269, 300000.00, "28/08", "03/10");

select * from produto;
select * from produto where preco > 500;
select * from produto where preco < 5000;

alter table produto add endereçodocliente varchar(255);
update produto set endereçodocliente = "Itaquera" where id = 1;



