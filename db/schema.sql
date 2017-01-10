
drop table if exists usuario;

create table usuario (
     id_usuario bigint not null auto_increment,
     nome varchar(255),
     sexo varchar(255),
     perfil varchar(255),
     ativo tinyint,
     primary key (id_usuario)
);

