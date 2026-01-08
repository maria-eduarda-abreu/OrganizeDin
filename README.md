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

---

## Arquitetura do Sistema

O projeto adota o padrão **RESTful** em um Monorepo, separando claramente as responsabilidades de Frontend e Backend.

```mermaid
graph TD
    User((👤 Usuário))
    
    subgraph "Frontend Layer"
        Web[ Aplicação Web<br>(HTML5 / JS / Bootstrap)]
        Mobile[📱 App Mobile<br>(Futuro: Android Nativo)]
    end
    
    subgraph "Backend Layer (API)"
        API[ Spring Boot API<br>(Rest Controllers)]
        Auth[ Autenticação]
        Service[⚙ Regras de Negócio]
        Repo[ Repositórios JPA]
    end
    
    subgraph "Data Layer"
        DB[(🗄 H2 Database / Oracle)]
    end

    User -->|Acessa via Navegador| Web
    User -->|Acessa via App| Mobile
    Web -->|JSON / HTTP| API
    Mobile -->|JSON / HTTP| API
    API --> Auth --> Service --> Repo
    Repo --> DB

Tecnologias Utilizadas
Backend (API):

Java 21 (LTS)

Spring Boot 3.5.4

Maven (Gerenciamento de dependências)

Spring Data JPA (Persistência)

H2 Database (Banco em memória para Dev)

Lombok (Redução de código boilerplate)

Frontend (Web):

HTML5 & CSS3

Bootstrap 5.2.3 (Responsividade)

JavaScript (ES6+) (Consumo de API via fetch)

Funcionalidades (Storymap)
Fase 1: MVP (Versão Atual)
[x] Cadastro: Registro de usuários com validação de e-mail único.

[x] Login: Autenticação simples via API.

[x] Dashboard: Visualização de Saldo Total, Receitas e Despesas (Dados mockados/iniciais).

[x] Integração: Comunicação assíncrona entre Frontend e Backend (JSON).

Fase 2: Gestão & Persistência (Em Breve)
[ ] CRUD de Transações: Adicionar/Editar receitas e despesas reais no banco.

[ ] Categorização: Classificação de gastos (Educação, Lazer, etc).

[ ] Segurança: Criptografia de senhas (BCrypt) e Tokens JWT.

Fase 3: Mobile & Expansão (Futuro)
[ ] App Android Nativo: Integração completa.

[ ] Metas: Definição de objetivos de curto/longo prazo.




