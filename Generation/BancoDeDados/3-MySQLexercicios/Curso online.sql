create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
tipodecurso varchar (255),
primary key (id)
);

insert into tb_categoria (tipodecurso) values ("Java");
insert into tb_categoria (tipodecurso) values ("POO");
insert into tb_categoria (tipodecurso) values ("Phython");
insert into tb_categoria (tipodecurso) values ("Bancodedados");


select * from tb_categoria;


create table tb_produto(
id bigint auto_increment,
produtos varchar (255) not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produto(produtos, preco, categoria_id) values ("Java na pratica", 1.00, 1);
insert into tb_produto(produtos, preco, categoria_id) values ("logica de programação", 10000.00, 2);
insert into tb_produto(produtos, preco, categoria_id) values ("Desvendando python", 200000.00, 3);
insert into tb_produto(produtos, preco, categoria_id) values ("MySQL", 5.00, 4);


select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60; 

select * from tb_produto where produtos like "%j%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where categoria_id = 1;
