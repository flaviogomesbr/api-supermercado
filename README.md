<div align="center">
    <h1>CRUD com Java Spring Boot</h1>
    <img width=150 src='https://vlb.de/assets/downloads/logo-mercadolivre-site.png'>
    <img width=150 src='https://teamcubation.com/media/logo-og-full.png'>
</div>

<p align="center">
	<img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/flaviogomesbr/beecrowd-urijudge?color=blueviolet" />
	<img alt="Number of lines of code" src="https://img.shields.io/tokei/lines/github/flaviogomesbr/beecrowd-urijudge?color=blueviolet" />
	<img alt="Code language count" src="https://img.shields.io/github/languages/count/flaviogomesbr/beecrowd-urijudge?color=blue" />
	<img alt="GitHub top language" src="https://img.shields.io/github/languages/top/flaviogomesbr/beecrowd-urijudge?color=blue" />
	<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/flaviogomesbr/beecrowd-urijudge?color=brightgreen" />
</p>


## Sobre

Resolução em Java (Spring Boot) para o CRUD básico de um supermercado, proposto como Exercício 6 do IT BootCamp do MELI.


## Requisitos
- [IDE Java IntelliJ ou equivalente técnico](https://www.jetbrains.com/pt-br/idea/) <br>
- [Java JDK 17](https://www.oracle.com/br/java/technologies/downloads/#java17) <br>
- [MySQL Community Server 8.0.35](https://dev.mysql.com/downloads/mysql/) <br>
- [MySQL Workbench 8.0.34](https://dev.mysql.com/downloads/workbench/) <br>
- [PostMan ou equivalente técnico](https://www.postman.com/downloads/) <br>

## Executando os códigos

```bash
# Garantir a instalação dos requisitos indicados anteriormente;
# Executar o comando a seguir dentro do MySQL WorkBench (ou software equivalente técnico):
create database aula;
# Executar o projeto dentro da IDE IntelliJ (ou software equivalente técnico)
# Dentro do software PostMan, no campo do endereço, digitar http://localhost:8080/produto
# Ainda no PostMan, no campo "body", executar a query do exemplo a seguir para gerar o primeiro registro (POST):
$ {
    "nome": "Feijão Branco",
    "valor": "5.49",
    "categoria": "basicos",
    "urlImagem": "https://static.clubeextra.com.br/img/uploads/1/787/23935787.png"
  }
# Ainda no PostMan, para testar a requisição "DELETE", no campo endereço, digitar o id a ser deletado no final. Exemplo que apagará o 2° registro: http://localhost:8080/produto/2
# Para consultar os registros no banco de dados, dentro do MySQL Workbench, digitar o seguinte comando :
SELECT * FROM aula.produto;
```