## api supermercado

<div align="center">
    <h1>
    <img width=150 src='https://s2-techtudo.glbimg.com/twoewJmwpMgtGPcRPP8SxFlDVmM=/0x0:695x393/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/P/f/y52r4ySZWLkJjEhKLhgw/2014-11-14-java-logo.jpg'>
    <img width=150 src='https://www.qindel.com/wp-content/uploads/2023/04/spring-boot.jpeg'>
    </h1>
</div>

## Sobre

API em Java (Spring Boot) com CRUD básico de um supermercado, inspirado nos tutoriais: 

- [AULA 1 - CRUD REST API Java, Spring, MySQL. Entidade com anotações, Mapeamento, Id e restrições de colunas](https://www.youtube.com/watch?v=aEAFpQfcu-0);
- [AULA 2 - CRUD REST Java, Spring, MySQL no VS Code. Criando Repository e o REST com todos os detalhes!](https://www.youtube.com/watch?v=e4oyd-8aDCw);
- [AULA 3 - Passo a passo para testar o nosso CRUD REST JAVA SPRING MySQL no VS Code](https://www.youtube.com/watch?v=b_vdrTDakB8); 
  

## Funcionalidades e requisitos da API

**Tecnologias e linguagens de programação**

- Java 17 ou 21;
- Spring Boot;
- MySQL;

**Operações que a aplicação deverá permitir**

- As quatro operações de um CRUD básico: CREATE (CRIAR), READ (LER), UPDATE (ALTERAR) e DELETE (EXCLUIR). Criando um projeto Spring / Java no VS Code e definindo uma Entidade com o mapeamento, passo a passo. Para que serve @Entity, @Id, @GeneratedValue, strategy, GenerationType, Column. Entende as variedades para gerar automaticamente o valor do identificador (Identity, Table, Auto e Sequence). Como definir um cambo obrigatório na Entidade (Hibernate - Spring Data - JPA). Como gerar getters and setters no VS Code. Estrutura básica do projeto Java no VS Code. Entenda o projeto Spring (como o main funciona - servidor embutido).  Como executar o projeto spring no VS Code. Onde definir pastas e classes em um projeto Spring. Como criar classes e pacotes em um projeto Java no Visual Studio Code. Como adicionar uma dependência em um projeto Spring no VS Code.

## Preparação do ambiente
- [Visual Studio Code ou equivalente técnico](https://code.visualstudio.com/) <br>
- [Java JDK 17](https://www.oracle.com/br/java/technologies/downloads/#java17) <br>
- [Maven](https://maven.apache.org/) <br>
- [MySQL Community Server 8.0.35](https://dev.mysql.com/downloads/mysql/) <br>
- [MySQL Workbench 8.0.34](https://dev.mysql.com/downloads/workbench/) <br>
- [Post Man ou equivalente técnico](https://www.postman.com/downloads/) <br>

## Executando o projeto

Garantir a instalação dos itens listados anteriormente em "Preparação do ambiente";

Clonar este projeto para a sua máquina e executar o seguinte comando dentro do MySQL WorkBench (ou outro software equivalente técnico):

```sh
create database aula;
```

Abrir e executar o projeto dentro da IDE IntelliJ (ou outro software equivalente técnico);

Dentro do software Postman, importar a seguinte collection da raiz do projeto:

`00_MELI_JavaSpringBoot_api_supermercado.postman_collection`

Executar as requisições do CRUD, iniciando pelo POST.

Para consultar os registros no banco de dados, dentro do MySQL Workbench, digitar o seguinte comando:

```sh
SELECT * FROM aula.produto;
```

**License**

[MIT](https://tldrlegal.com/license/mit-license)