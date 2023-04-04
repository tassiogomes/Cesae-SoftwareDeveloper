-- 4. Proceda às seguintes alterações de dados: --

-- a. Na venda nr. 2, altere a quantidade para 10.

UPDATE venda
SET qtd = 10
WHERE cli = 2;

-- b. Mude a morada do Raul para Porto.

UPDATE cliente
SET morada = 'Porto'
WHERE nome = 'Raul Simas';

-- c. Altere o preço do monitor para 100euros.

UPDATE produto
SET preco = '100'
WHERE id = 2;



-- 5. Escreva as seguintes consultas SQL:

-- a. Mostre todos os produtos da loja.

SELECT *
FROM produto;

-- b. Mostre todos os nomes dos clientes ativos.

SELECT *
FROM cliente
WHERE cliente = 1;

-- c. Mostre todas as vendas realizadas ao cliente Raul Simas.

SELECT *
FROM venda
JOIN cliente ON venda.cli = cliente.id
WHERE cliente.nome = 'Raul Simas';

-- d. Mostre todas as vendas realizadas aos clientes com nome começado pela letra H.

SELECT *
FROM venda
JOIN cliente ON venda.cli = cliente.id
WHERE cliente.nome LIKE 'H%';


e. Mostre quantas vendas foram realizadas ao cliente Raul Simas.3

SELECT COUNT(*) as Vendas_Raul
FROM venda
JOIN cliente ON venda.cli = cliente.id
WHERE cliente.nome = 'Raul Simas';

f. Mostre o valor do produto mais caro na loja.

SELECT MAX(preco) as Produto_mais_caro
FROM produto;


g. Mostre quais os produtos cujo preço é menor ou igual a 100 euros.

SELECT *
FROM produto
WHERE preco <= 100


h. Mostre os nomes dos clientes que nunca compraram nada.

SELECT nome
FROM cliente
WHERE cliente.id NOT IN(
                        SELECT venda.cli
                        FROM venda);



i. Mostre o total faturado a cada dia.

SELECT SUM(preco) as total, data
FROM venda
JOIN produto ON produto.id = venda.prod;

























