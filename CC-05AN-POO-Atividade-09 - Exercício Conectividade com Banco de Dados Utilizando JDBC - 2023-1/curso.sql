create schema if not exists CURSO;
use curso;

CREATE TABLE IF NOT EXISTS CURSO.TABCURSO (
  codCurso INT NOT NULL,
  nomeCurso VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (codCurso)
);

select * from tabcurso;