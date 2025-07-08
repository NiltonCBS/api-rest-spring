# 📦 api-rest-spring

Este repositório contém uma **API RESTful** desenvolvida com **Spring Boot**, ideal para gerenciamento de ninjas e missões do anime naruto. A API segue os princípios REST e inclui operações completas de **CRUD**, autenticação (se aplicável), e configuração para persistência com **Spring Data JPA**.
A ideia do projeto foi utiliza-ló para estudos e desenvolvido em aula.
---

## 🚀 Tecnologias

Desenvolvido em SpringBoot
Banco de Dados: H2 (em memória, configuração no `application.properties`)

---

## 📁 Estrutura do Projeto

```
Cadastro Ninja
src/
├── main/
│ ├── java/
│ │ └── br.com.viladafolha.CadastroNinja/
│ │ ├── Controller/ ← Endpoints REST
│ │ ├── Entity/ ← Entidades JPA
│ │ ├── Repository/ ← Interfaces Spring Data
│ │ └── Service/ ← Lógica de negócio
│ └── resources/
│ └──  application.properties
└── test/
```


---

## 🛠️ Como Executar

1. **Clone o repositório**
    ```bash
    git clone https://github.com/NiltonCBS/api-rest-spring.git
    cd api-rest-spring
    ```

2. **Configuração**
    - Edite `src/main/resources/application.properties`:
  
      ```properties
      spring.datasource.driver-class-name=org.h2.Driver
      spring.datasource.url=jdbc:h2:~/test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
      spring.h2.console.enabled=true
      spring.h2.console.path=/h2-console
      spring.datasource.username=YOUR-USERNAME
      spring.datasource.password=YOUR-PASSWORD
      ```

3. **Rodar a aplicação**
    ```bash
    ./mvnw spring-boot:run
    ```
    Ou execute a classe `CadastroNinjaApplication` na sua IDE favorita.

4. **Acesse a API**
    - Base URL: `http://localhost:8080`
    - (Opcional) Dashboard H2: `http://localhost:8080/h2-console` — usuário: `Your-User`, senha: `Your-Senha`.

---

## 📋 Endpoints Principais

🥷 Ninja

| Método | Rota                        | Descrição                      |
|--------|-----------------------------|--------------------------------|
| GET    | `/api/ninja/listar`         | Lista todos os ninjas          |
| GET    | `/api/ninja/pesquisar/{id}` | Busca ninja por ID             |
| POST   | `/api/ninja/cadastrar`      | Cria novo ninja                |
| PUT    | `/api/ninja/alterar/{id}`   | Atualiza ninja existente       |
| DELETE | `/api/ninja/deletar/{id}`   | Remove ninja                   |

🎯 Missão

| Método | Rota                        | Descrição                      |
|--------|-----------------------------|--------------------------------|
| GET    | `/api/missao/listar`         | Lista todos os itens          |
| GET    | `/api/missao/pesquisar/{id}` | Busca item por ID             |
| POST   | `/api/missao/cadastrar`      | Cria novo item                |
| PUT    | `/api/missao/alterar/{id}`   | Atualiza item existente       |
| DELETE | `/api/missao/deletar/{id}`   | Remove item                   |

## 📋 Endpoints da Interface Web (Thymeleaf)

🥷 Ninja

| Método | Rota               | Descrição                            | View retornada                      |
| ------ | ------------------ | ------------------------------------ | ----------------------------------- |
| GET    | `/ui/index`        | Página inicial                       | `index.html`                        |
| GET    | `/ui/listarninjas` | Lista todos os ninjas                | `ninjas.html`                       |
| GET    | `/ui/cadastrar`    | Formulário para cadastrar novo ninja | `cadastrarninja.html`               |
| POST   | `/ui/salvar`       | Salva novo ninja                     | Redireciona para `/ui/listarninjas` |
| GET    | `/ui/editar/{id}`  | Formulário de edição de ninja        | `detalhesninja.html`                |
| POST   | `/ui/atualizar`    | Atualiza dados do ninja              | Redireciona para `/ui/listarninjas` |
| GET    | `/ui/excluir/{id}` | Exclui ninja                         | Redireciona para `/ui/listarninjas` |

🎯 Missão

| Método | Rota                      | Descrição                             | View retornada                             |
| ------ | ------------------------- | ------------------------------------- | ------------------------------------------ |
| GET    | `/ui/index`               | Página inicial                        | `index.html`                               |
| GET    | `/ui/missao/listarmissao` | Lista todas as missões                | `missao.html`                              |
| GET    | `/ui/missao/cadastrar`    | Formulário para cadastrar nova missão | `cadastrarmissao.html`                     |
| POST   | `/ui/missao/salvar`       | Salva nova missão                     | Redireciona para `/ui/missao/listarmissao` |
| GET    | `/ui/missao/editar/{id}`  | Formulário de edição de missão        | `detalhesmissao.html`                      |
| POST   | `/ui/missao/atualizar`    | Atualiza dados da missão              | Redireciona para `/ui/missao/listarmissao` |
| GET    | `/ui/missao/excluir/{id}` | Exclui missão                         | Redireciona para `/ui/missao/listarmissao` |


---

## 👤 Autor
Nilton Santos • GitHub/NiltonCBS


