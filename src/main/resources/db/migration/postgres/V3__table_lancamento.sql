CREATE TABLE IF NOT EXISTS lancamento(
    id serial not null primary key,
    data_lancamento timestamp not null,
    descricao varchar(50) not null,
    localizacao varchar(50) not null,
    data_criacao timestamp not null,
    data_atualizacao timestamp,
    tipo varchar(50) not null,
    funcionario_id int,
    CONSTRAINT fk_funcionario_id FOREIGN KEY(funcionario_id)  REFERENCES funcionario(id) ON DELETE SET NULL
);