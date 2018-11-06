CREATE TABLE tcc.concessao(
	id serial not null,
	nome varchar(100) not null
);

CREATE TABLE tcc.parametros(
	id serial not null,
	grupo varchar(100) not null,
	descricao varchar(100) not null,
	sigla varchar(50) not null,
	valor varchar(50) not null,
	id_concessao Integer not null,
	ativo boolean not null
);