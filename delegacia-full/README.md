
# Projeto Delegacia – Sistema de Chamados
 ## Integrantes- **Ryan Eleutherio Dias** – **Vinícius Esteves de Souza** – **Amanda Esteves Brito dos Santos** – 
## Etapa 1 — Criação do Projeto
 Desenvolvimento de um projeto Spring Boot utilizando Maven, configurado com as dependências
 essenciais: Spring Web, Spring Data JPA, Spring Security, Thymeleaf e MySQL.
 ## Etapa 2 — Estrutura de Pastas
 Organização do projeto seguindo padrões do Spring Boot, com diretórios separados para controllers,
 services, repositories, entities, dtos e templates Thymeleaf.
 ## Etapa 3 — Configuração do Banco de Dados
 Integração com banco de dados **MySQL**, com credenciais configuradas no arquivo
 `application.properties` e geração automática de tabelas via JPA/Hibernate.
 ## Etapa 4 — Entidades
 Foram criadas as entidades:- **Chamado**- **Departamento**
 Com seus respectivos relacionamentos e validações.
 ## Etapa 5 — DTOs e Services
 Implementação de DTOs para transferência de dados de forma segura e organizada, e criação de
 camada Service para regras de negócio.
 ## Etapa 6 — Controllers REST e Thymeleaf
Criação de endpoints REST para Chamados e Departamentos, além de páginas Thymeleaf para
 interação visual do usuário.
 ## Etapa 7 — Autenticação (Spring Security)
 Configuração de sistema de login utilizando Spring Security, com controle de acesso às páginas e
 rotas protegidas.
 ## Etapa 8 — Swagger
 Integração do Swagger para documentação completa da API, acessível via `/swagger-ui.html`.
 ## Etapa 9 — Testes e Documentação
 Testes básicos de validação, revisão final e documentação do projeto por meio deste README.--
## Como Executar o Projeto
 1. Instale **Java 17**, **Maven** e **MySQL**.
 2. Crie o banco de dados:
 ```sql
 CREATE DATABASE delegacia;
 ```
 3. Configure `application.properties` com suas credenciais.
 4. Execute:
 ```bash
 mvn spring-boot:run
 ```
 5. Acesse:- Aplicação: `http://localhost:8080`- Swagger: `http://localhost:8080/swagger-ui.html`
--
## Créditos
 Projeto desenvolvido como parte de trabalho acadêmico pelos alunos:- Ryan Eleutherio Dias- Vinícius Esteves de Souza- Amanda Esteves Brito dos Santos
