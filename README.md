# 🧠 Employee Management System (EMS) - Backend

Bem-vindo ao **EMS-Backend**, um projeto Java + Spring Boot voltado para o gerenciamento de funcionários. Aqui, construímos uma API REST moderna utilizando as melhores práticas de arquitetura e organização de código.

Este repositório pode ser utilizado como **base de estudo**, **exemplo de arquitetura Spring Boot**, ou ponto de partida para projetos mais robustos.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia          | Descrição                                                |
| ------------------- | -------------------------------------------------------- |
| Java 21             | Linguagem principal do projeto                           |
| Spring Boot         | Framework principal para construção da API REST          |
| Spring Web          | Criação de endpoints HTTP com suporte RESTful            |
| Spring Data JPA     | Camada de persistência com JPA + Hibernate               |
| Hibernate           | Implementação ORM usada pelo JPA                         |
| PostgreSQL          | Banco de dados relacional para persistência dos dados    |
| Lombok              | Redução de código repetitivo com anotações automáticas   |
| Gradle              | Ferramenta de build e gerenciamento de dependências      |
| VS Code + Extensões | IDE leve com suporte completo ao ecossistema Spring Boot |

---

## 📁 Estrutura de Pastas

```bash
src/
└── main/
    └── java/
        └── com/gabrielsouzas/ems/
            ├── controller/     # Endpoints da API
            ├── dto/            # Objetos de transferência de dados (DTOs)
            ├── entity/         # Entidades JPA mapeadas com o banco
            ├── exception/      # Tratamento de exceções
            ├── mapper/         # Conversores entre DTOs e Entities
            ├── repository/     # Interfaces que acessam o banco (JPA)
            └── service/
                └── impl/       # Implementações das regras de negócio
```

---

## 🧩 Conceitos Abordados

### 🔹 `@RestController`

Define os **pontos de entrada HTTP** da aplicação, como `/api/employees`.

### 🔹 DTO (Data Transfer Object)

Isola os dados trocados com o frontend, evitando expor diretamente a entidade.

### 🔹 Entity (`@Entity`)

Mapeia uma classe Java para uma **tabela no banco PostgreSQL**.

### 🔹 Repository (`JpaRepository`)

Camada que abstrai operações no banco como `save()`, `findById()` e `delete()`.

### 🔹 Service

Contém a **lógica de negócio**. Recebe dados do controller e interage com o repository.

### 🔹 Mapper

Responsável por **converter entre DTOs e Entities**, mantendo as camadas desacopladas.

### 🔹 Exception

Gerencia os erros com mensagens personalizadas e respostas HTTP apropriadas.

---

## ⚙️ Requisitos

- Java 21
- PostgreSQL 15+ (ou compatível)
- Gradle (já incluído no wrapper)
- VS Code (ou editor de sua preferência)

---

## ✅ Passo a passo para rodar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seuusuario/ems-backend.git
cd ems-backend
```

### 2. Configure o banco PostgreSQL

Crie um banco de dados chamado `ems` (ou outro nome que você queira):

```sql
CREATE DATABASE ems;
```

### 3. Configure o arquivo `application.properties` (ou `application.yml`)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ems
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Compile e execute

```bash
./gradlew bootRun
```

A API ficará disponível em:
📡 `http://localhost:8080`

---

## 🔍 Testando a API

Se você não estiver usando Postman, instale a extensão **Thunder Client** no VS Code e use:

### Exemplo: Criar Funcionário (POST)

**URL:** `http://localhost:8080/api/employees`
**Body (JSON):**

```json
{
  "name": "Gabriel Souza",
  "department": "Desenvolvimento"
}
```

### Exemplo: Buscar todos os funcionários (GET)

**URL:** `http://localhost:8080/api/employees`

---

## 📦 Extensões recomendadas no VS Code

- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)
- [Lombok Annotations Support](https://marketplace.visualstudio.com/items?itemName=GabrielBB.vscode-lombok)
- [Thunder Client (REST Client)](https://marketplace.visualstudio.com/items?itemName=rangav.vscode-thunder-client)

---

## 🧪 Futuras melhorias

- ✅ Validações com `@Valid`
- ✅ Testes unitários e de integração
- 🔒 Spring Security com autenticação
- 🧩 Versionamento de API (`/v1`, `/v2`)
- 📊 Swagger (documentação interativa da API)
- 📁 Docker para facilitar deploy

---

## 🤝 Contribuindo

Se quiser contribuir com melhorias, testes, sugestões ou refatorações, fique à vontade para abrir **pull requests** ou **issues**.

---

## 🧑‍💻 Autor

Gabriel Souza
[GitHub](https://github.com/gabrielsouzas) • Desenvolvedor apaixonado por qualidade de código, APIs limpas e tecnologia aplicada a dados e performance.

---

## 📄 Licença

Este projeto é open-source sob a licença MIT. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

```

```
