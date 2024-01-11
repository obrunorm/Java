create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
sabor varchar (255),
Bordarecheada boolean,
primary key (id)
);

insert into tb_categoria (sabor, bordarecheada) values ("salgada", true);
insert into tb_categoria (sabor, bordarecheada) values ("salgada", false);
insert into tb_categoria (sabor, bordarecheada) values ("doce", true);
insert into tb_categoria (sabor, bordarecheada) values ("doce", false);

select * from tb_categoria;


create table tb_pizza(
id bigint auto_increment,
cardapio varchar (255) not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_pizza(cardapio, preco, categoria_id) values ("Atum", 500.00, 1 );
insert into tb_pizza (cardapio, preco, categoria_id) values ("Bauru", 500.00, 2);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Calabresa", 800.00, 1);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Espinafre", 300.00, 1);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Escarola", 1000.00, 2);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Lombo", 900.00, 1);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Mussarela", 5.00, 2);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Brigaeiro", 10.00, 3);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Chocolate branco", 2.00, 3);
insert into tb_pizza (cardapio, preco, categoria_id) values ("Prestigio", 2000.00, 4);



select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60; 

select * from tb_pizza where cardapio like "%c%";

select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.categoria_id order by nome;

select * from tb_pizza where categoria_id = 3;

