CREATE TABLE IF NOT EXISTS funcionario (
    id serial not null primary key,
    nome varchar(100) not null,
    email varchar(40) not null,
    senha varchar(200) not null,
    cpf varchar(11) not null,
    valor_hora numeric(19,2) not null,
    qtd_horas_trabalhada_dia float not null,
    qtd_horas_almoco float not null,
    perfil_enum varchar(50) not null,
    data_criacao timestamp not null,
    data_atualizacao timestamp,
    empresa_id int,
    CONSTRAINT fk_empresa_id FOREIGN KEY(empresa_id)  REFERENCES empresa(id) ON DELETE SET NULL
);