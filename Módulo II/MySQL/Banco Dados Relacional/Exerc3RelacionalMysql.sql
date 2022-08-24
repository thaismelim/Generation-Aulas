
/*PRECISO CRIAR BANCO DE DADOS PARA CRIAR TABELA DEPOIS / db = database para tabela tb*/ 

/*Comando de criação de banco de dados*/
CREATE DATABASE db_escola_generation;

/* PASSO A PASSO PADRÃO = CREATE --> USE --> CREATE TABLE */

/*Seleciona o banco de dados a ser usado*/
USE db_escola_generation;

/*Comando para criação de tabela*/

/*bigint numero inteiro*/
/*varchar String - caracter*/
/*8 numero total e 2 sao os numeros que aceito depois da virgula*/

/*Atributos da tabela*/
CREATE TABLE tb_alunes(
id bigint auto_increment primary key,	
nome varchar(255),						
data_nascimento date,
turma int,
nota decimal(4,2)					
);

/*Comando para consulta*/
SELECT * FROM tb_alunes;

/*Inserir dados na tabela (8 registros) */
INSERT INTO tb_alunes(nome, data_nascimento,turma,nota)VALUES("Jessica Lopes","1997-09-17",57,5);

/*Selecione todos os dados da tabela de alunes*/
SELECT * FROM tb_alunes;

/* Seleciona todos os dados da tabela de alunos ONDE a nota for maior que 7*/

SELECT * FROM tb_alunes WHERE nota >7;

SELECT * FROM tb_alunes WHERE nota <7;

UPDATE tb_alunes SET nome = Lucas WHERE id=7;

SELECT * FROM tb_alunes;

 


