CREATE TABLE IF NOT EXISTS empresa (
    id serial not null primary key,
    cnpj varchar(20) not null unique,
    data_atualizacao timestamp not null,
    data_criacao timestamp not null,
    razao_social varchar(100) not null
);