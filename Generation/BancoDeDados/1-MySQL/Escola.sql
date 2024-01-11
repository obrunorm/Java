create database db_escola;

use db_escola;

create table alunos(
id bigint auto_increment,
nome varchar(225) not null,
sala int,
nota decimal (8,2),
primary key (id)
);
insert into alunos(nome, sala, nota) values ("Cleber", 31, 7.0);
insert into alunos(nome, sala, nota) values ("Clebera", 29, 5.0);
insert into alunos(nome, sala, nota) values ("Clebere", 30, 10.0);
insert into alunos(nome, sala, nota) values ("Cleberi", 31, 3.0);
insert into alunos(nome, sala, nota) values ("Clebero", 29, 2.0);

select * from alunos;
select * from alunos where nota > 7.0;
select * from alunos where nota < 7.0;

update alunos set nota = 1.00 where id = 1;


