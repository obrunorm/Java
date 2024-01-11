create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
id bigint auto_increment,
classe varchar(255) not null,
ataque bigint,
defesa bigint,
velocidade bigint,
mana bigint,
destreza bigint,
ativo boolean not null,
primary key (id)
);

-- atributos vão até 1000

insert into tb_classes (classe, ataque, defesa, velocidade, mana, destreza, ativo) values ("Guerreiro", 800, 800, 400, 0, 500, true);
insert into tb_classes (classe, ataque, defesa, velocidade, mana, destreza, ativo) values ("Feiticeiro",900, 200, 600, 900, 100, true);
insert into tb_classes (classe, ataque, defesa, velocidade, mana, destreza, ativo) values ("Assassino", 750, 500, 900, 200, 700, true);
insert into tb_classes (classe, ataque, defesa, velocidade, mana, destreza, ativo) values ("Arqueiro", 700, 500, 650, 400, 900, true);
insert into tb_classes (classe, ataque, defesa, velocidade, mana, destreza, ativo) values ("Paladino", 700, 700, 500, 700, 500, true);

select * from tb_classes;


create table tb_personagens (
id bigint auto_increment,
nome varchar (255) not null,
datanasc date not null,
raça varchar (255) not null,
classes_id bigint,
primary key (id),
FOREIGN KEY (classes_id) REFERENCES tb_classes(id)
);

insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem1", "1996-01-26", "draconatos", 3);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem2", "1997-02-11", "anão", 1);
insert into tb_personagens(nome, datanasc, raça, classes_id) values ("personagem3", "2002-06-06", "elfo", 4);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem4", "1990-05-09", "humano", 2);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem5", "1991-07-09", "meio-orc", 1);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem6", "1993-11-12", "anão", 5);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem7", "1990-02-13", "elfo", 3);
insert into tb_personagens (nome, datanasc, raça, classes_id) values ("personagem8", "1985-10-22", "humano", 5);



select * from tb_personagens;

select * from tb_classes where ataque> 200;

select * from tb_classes where defesa between 200 and 600; 

select * from tb_personagens where nome like "%c%";

select * from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.classes_id order by nome;

select * from tb_personagens where classes_id = 4;


