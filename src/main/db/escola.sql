CREATE DATABASE escola
DEFAULT CHARACTER SET = 'utf8mb4';

USE escola;

CREATE TABLE alunos (
id bigint(20) NOT NULL AUTO_INCREMENT,
nome varchar(255) NOT NULL,
email varchar(255) NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Cadastro de alunos';
