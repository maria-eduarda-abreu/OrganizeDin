# 💰 OrganizeDin - Gestão Financeira Inteligente

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.4-brightgreen?style=for-the-badge&logo=spring-boot)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.2.3-purple?style=for-the-badge&logo=bootstrap)
![Status](https://img.shields.io/badge/Status-MVP_Em_Desenvolvimento-yellow?style=for-the-badge)

> **Challenge FIAP 2025** - Solução tecnológica para combate ao endividamento por meio da gestão financeira.

---

## Sobre o Projeto

O **OrganizeDin** é um ecossistema de gerenciamento financeiro focado em simplicidade e educação. Nosso objetivo é mitigar o número de pessoas endividadas no Brasil através de uma ferramenta que centraliza receitas, despesas e metas.

O sistema foi projetado com uma **Arquitetura Client-Server**, onde uma API robusta serve múltiplos clientes (Web e Mobile), garantindo integridade e sincronização dos dados em qualquer dispositivo.

### OrganizeDin Prototype
[Acesse o protótipo do OrganizeDin](https://www.figma.com/design/DJ0IvEIKEQy1O9I23S00Yv/OrganizeDIn?node-id=108-498&t=JD8UQIm0UQ3P6DzS-1)

### OrganizeDin Storymap
[Acesse o Storymap do OrganizeDin](https://www.figma.com/board/Z2kI9k0vGbybTcWfgI1mR0/Story-Map-Fluxograma----OrganizeDin--Copy-?node-id=0-1&t=huBgdyv1VjFUyK6s-1)

---

## Arquitetura do Sistema

O projeto adota o padrão **RESTful** em um Monorepo, separando claramente as responsabilidades de Frontend e Backend.

    
### Frontend Layer
        Web - Aplicação Web (HTML5 / JS / Bootstrap)
        Mobile - App Mobile(Futuro: Android Nativo)
   
    
### Backend Layer (API)
        API - Spring Boot API(Rest Controllers)
        Auth - Autenticação
        Service - ⚙ Regras de Negócio
        Repo - Repositórios JPA
    
### Data Layer
        DB - 🗄 H2 Database / Oracle
  

## Tecnologias Utilizadas
Backend (API):
- Java 21 (LTS)
- Spring Boot 3.5.4
- Maven (Gerenciamento de dependências)
- Spring Data JPA (Persistência)
- H2 Database (Banco em memória para Dev)
- Lombok (Redução de código boilerplate)

Frontend (Web):
- HTML5 & CSS3
- Bootstrap 5.2.3 (Responsividade)
- JavaScript (ES6+) (Consumo de API via fetch)

--- 

### Funcionalidades 


- Fase 1: MVP (Versão Atual)
  
[x] Cadastro: Registro de usuários com validação de e-mail único.

[x] Login: Autenticação simples via API.

[x] Dashboard: Visualização de Saldo Total, Receitas e Despesas (Dados mockados/iniciais).

[x] Integração: Comunicação assíncrona entre Frontend e Backend (JSON).

- Fase 2: Gestão & Persistência (Em Breve)
  
[ ] CRUD de Transações: Adicionar/Editar receitas e despesas reais no banco.

[ ] Categorização: Classificação de gastos (Educação, Lazer, etc).

[ ] Segurança: Criptografia de senhas (BCrypt) e Tokens JWT.

- Fase 3: Mobile & Expansão (Futuro)

[ ] App Android Nativo: Integração completa.

[ ] Metas: Definição de objetivos de curto/longo prazo.




