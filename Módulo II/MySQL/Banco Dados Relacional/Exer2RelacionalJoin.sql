CREATE DATABASE db_pizzaria;

USE db_pizzaria;

CREATE TABLE tb_categorias(

id bigint auto_increment primary key,
descricao varchar(255),
tamanho varchar(255),
borda_recheada boolean

);

CREATE TABLE tb_pizzas(
id bigint auto_increment primary key,
sabor varchar(2550),
preco decimal(6,2),
massa varchar(255),
quantidade int,
categoria_id bigint,

 FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

SELECT * FROM tb_categorias;

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Brotinho",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Brotinho",false);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Medio",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Medio",false);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Grande",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Grande",false);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Doce","Brotinho",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Doce","Grande",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Vegetariana","Brotinho",true);
INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Vegana","Brotinho",false);

SELECT * FROM 	tb_pizzas;

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Frango C/ Catupiry", 30.00,"tradicional",5,1);

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Musssarela", 40.59,"tradicional",5,2);

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Prestigio", 50.99,"tradicional",2,8);

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Lombo C/ Catupiry", 60.99,"tradicional",3,6);

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Brocolis C/ Catupiry", 40,"tradicional",4,9);

INSERT INTO tb_pizzas(sabor, preco, massa, quantidade, categoria_id)
VALUES ("Calabresa", 45.99,"tradicional",5,1);

/* Estrutura de uma consulta: SELECT - CONDICAO - ORDENACAO */
SELECT * FROM tb_pizzas WHERE preco > 45.00 ORDER BY preco DESC;

/* Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo de R$ 50.00 e R$100.00*/
SELECT * FROM tb_pizzas WHERE preco >= 50.00 AND preco <= 100;

/* Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo de R$50.00 e R$100.00*/
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100;

/* Traz somente os sabores das pizzas com preço entre 50 e 100 reais*/
SELECT sabor FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100;

SELECT * FROM tb_pizzas WHERE sabor LIKE "%m%";

SELECT * FROM tb_pizzas INNER JOIN tb_categorias
ON tb_categorias.id = tb_pizzas.categoria_id;

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id WHERE categoria_id =8;
