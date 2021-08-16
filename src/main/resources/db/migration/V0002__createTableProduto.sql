CREATE TABLE produto(
    codigo bigint not null auto_increment,
    produto varchar(100) not null,
    quantidade bigint not null,
    valor double not null,
    estoque double not null,
     primary key (codigo)
);