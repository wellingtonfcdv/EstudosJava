create table clientes(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar (11) not null,
    rg varchar (9),
    dataNascimento varchar(8),
    email varchar(100) not null unique,
    telefone varchar(10),
    celular varchar(11) not null,
    primary key(id)
);