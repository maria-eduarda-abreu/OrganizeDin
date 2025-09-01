### OrganizeDin

#### <p align="center">Gerencie suas finanças de forma simples e intuitiva.</p>

---

### 📋 Índice

- [Descrição do Projeto](#-descrição-do-projeto)
- [Funcionalidades](#-funcionalidades)
- [Protótipo das Telas](#-protótipo-das-telas)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura do Projeto](#-arquitetura-do-projeto)
- [Como Rodar o Projeto](#-como-rodar-o-projeto)
- [Endpoints da API](#-endpoints-da-api)

---

### 📝 Descrição do Projeto

O **OrganizeDin** é uma plataforma de gerenciamento financeiro desenvolvida como um projeto de estudo. O objetivo é fornecer aos usuários uma ferramenta completa para educação financeira, que inclui gerenciamento de finanças, planejamento financeiro e visualização de dados. Diferentemente de outros aplicativos que oferecem funcionalidades limitadas ou planos pagos, o OrganizeDin busca ser uma solução completa e acessível.

### ✨ Funcionalidades

- **Cadastro e Login de Usuários:** Sistema de autenticação para acesso seguro à plataforma.
- **Painel de Controle (Dashboard):** Visão geral do saldo, receitas, despesas e últimas transações.
- **Futuras Funcionalidades:**
    - Gerenciamento de despesas e receitas.
    - Planejamento de metas financeiras.
    - Seção de notícias e estudos sobre finanças.

### 🖼️ Protótipo das Telas

<div align="center">
 [ Acesse o protótipo das telas do projeto pelo Figma](https://www.figma.com/design/DJ0IvEIKEQy1O9I23S00Yv/OrganizeDIn?node-id=0-1&t=a4Enrjbmm19sJS9B-1) </a>
</div>


### 💻 Tecnologias Utilizadas

O projeto utiliza uma arquitetura de duas camadas (front-end e back-end) e as seguintes tecnologias:

**Front-end:**
- HTML5
- CSS3
- JavaScript
- [Bootstrap](https://getbootstrap.com/)

**Back-end:**
- Java
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [Lombok](https://projectlombok.org/)
- [H2 Database](https://www.h2database.com/html/main.html)

### 🧱 Arquitetura do Projeto

O projeto segue uma arquitetura de monorepo, com o front-end e o back-end em pastas separadas para melhor organização e desenvolvimento.

### ▶️ Como Rodar o Projeto

Siga os passos abaixo para executar o projeto em sua máquina.

**Pré-requisitos:**
- [Java Development Kit (JDK) 21 ou superior](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- Um editor de código, como o [VS Code](https://code.visualstudio.com/)

**1. Clone o Repositório:**

```bash
git clone [https://github.com/seu-usuario/OrganizeDin.git](https://github.com/seu-usuario/OrganizeDin.git)
cd OrganizeDin

2. Rodar o Back-end:

Abra um terminal na pasta principal do projeto.

Navegue até a pasta backend:

Bash

cd backend
Execute o projeto com o Maven Wrapper:

Bash

./mvnw spring-boot:run
No Windows, você pode usar:

Bash

mvnw spring-boot:run
Aguarde até que o terminal exiba a mensagem de que a aplicação foi iniciada.

3. Rodar o Front-end:

Abra o VS Code na pasta principal do projeto.

Instale a extensão "Live Server" se ainda não a tiver.

Navegue até a pasta frontend e abra o arquivo index.html.

Clique em "Go Live" na barra de status do VS Code para abrir o projeto no seu navegador.

⚙️ Endpoints da API
A API foi desenvolvida usando Spring Boot e expõe os seguintes endpoints:

Método	Endpoint	Descrição
POST	/api/register	Cria um novo usuário no banco de dados.
POST	/api/login	Autentica um usuário existente.
GET	/dashboard/summary	Retorna um resumo dos dados do painel (saldo, receitas, despesas).

