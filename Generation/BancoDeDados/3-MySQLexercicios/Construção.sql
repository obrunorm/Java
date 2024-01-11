create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
setor varchar (255),
primary key (id)
);

insert into tb_categoria (setor) values ("Hidraulica");
insert into tb_categoria (setor) values ("Canos");
insert into tb_categoria (setor) values ("Banheiro");
insert into tb_categoria (setor) values ("Ferramentas");
insert into tb_categoria (setor) values ("Construção");

select * from tb_categoria;


create table tb_produto(
id bigint auto_increment,
produtos varchar (255) not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produto(produtos, preco, categoria_id) values ("Privada", 1.00, 3);
insert into tb_produto(produtos, preco, categoria_id) values ("Cano tigre", 10000.00, 2);
insert into tb_produto(produtos, preco, categoria_id) values ("Tijogo", 200000.00, 5);
insert into tb_produto(produtos, preco, categoria_id) values ("Valvula", 5.00, 1);


select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60; 

select * from tb_produto where produtos like "%c%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where categoria_id = 1;

