# Vollmed API

## Visão Geral do Projeto

A Vollmed API é uma API RESTful desenvolvida como parte do programa **Alura, Oracle Next Education - T6**.  
Ela serve como backend para o gerenciamento de **consultas médicas, médicos e pacientes**.

## 🛠 Tecnologias

- **Java 17**: Linguagem de programação utilizada no desenvolvimento da aplicação.
- **Spring Boot**: Framework para construção de aplicações web em Java, fornecendo recursos como injeção de dependências, segurança e acesso a dados.

## 📦 Dependências

O projeto utiliza **Maven** para gerenciamento de dependências. As principais dependências incluem:

- `spring-boot-starter-web` → Construção de aplicações web.
- `spring-boot-starter-data-jpa` → Persistência de dados utilizando JPA.
- `spring-boot-starter-validation` → Validação de dados de entrada.
- `flyway-core` e `flyway-mysql` → Migração de banco de dados.
- `mysql-connector-java` → Conexão com banco de dados MySQL.
- `spring-boot-starter-security` → Segurança da aplicação.
- `java-jwt` → Manipulação de JSON Web Tokens.
- `springdoc-openapi-starter-webmvc-ui` → Geração da documentação da API.

## 🗄 Banco de Dados

A aplicação utiliza **MySQL** como banco de dados, com **Flyway** para gerenciamento de migrações.  
O esquema do banco de dados é definido em scripts de migração localizados no diretório:  
src/main/resources/db/migration

## 📌 Endpoints

### 🔐 Autenticação

- **`POST`** `/login` → Autentica um usuário e retorna um token JWT.

### 📅 Consultas

- **`POST`** `/consultas` → Agenda uma nova consulta.
- **`DELETE`** `/consultas` → Cancela uma consulta agendada.

### 🏥 Médicos

- **`POST`** `/medicos` → Cadastra um novo médico.
- **`GET`** `/medicos` → Lista todos os médicos ativos.
- **`PUT`** `/medicos` → Atualiza as informações de um médico existente.
- **`DELETE`** `/medicos/{id}` → Exclui um médico pelo ID.
- **`GET`** `/medicos/{id}` → Retorna informações detalhadas sobre um médico específico.

### 👨‍⚕️ Pacientes

- **`POST`** `/pacientes` → Cadastra um novo paciente.
- **`GET`** `/pacientes` → Lista todos os pacientes ativos.
- **`PUT`** `/pacientes` → Atualiza as informações de um paciente existente.
- **`DELETE`** `/pacientes/{id}` → Exclui um paciente pelo ID.
- **`GET`** `/pacientes/{id}` → Retorna informações detalhadas sobre um paciente específico.

## 📌 Conclusão

Esta API fornece um **backend robusto** para gerenciamento de **consultas médicas, médicos e pacientes**,  
utilizando **tecnologias modernas** e **boas práticas de desenvolvimento de software**.

---

💻 Desenvolvido por **Alura & Oracle Next Education - T6** 🚀
