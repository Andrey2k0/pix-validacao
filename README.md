# 🛡️ Sistema de Validação de Segurança Pix (Projeto A3)

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Frontend](https://img.shields.io/badge/Frontend-HTML%20%2B%20Tailwind-purple)

## 📖 Sobre o Projeto
Este projeto foi desenvolvido como parte da **Atividade Avaliativa A3** da UniCuritiba. 

O objetivo é simular um ambiente de **fintech** focado em segurança. A aplicação previne fraudes bancárias (contas "laranjas") ao validar, em tempo real, se o destinatário de uma transferência Pix possui a documentação (CNH) regularizada no banco de dados. Caso contrário, a transação é bloqueada na origem.

---

## 🚀 Tecnologias Utilizadas

* **Backend:** Java 17, Spring Boot 3 (Web, Data JPA, Validation).
* **Banco de Dados:** MySQL 8.0.
* **Frontend:** HTML5, CSS3 (TailwindCSS via CDN) e JavaScript Vanilla.
* **Ferramentas:** Maven, IntelliJ IDEA, Git/GitHub.
* **Arquitetura:** MVC com API RESTful.

---

## 🗂️ Estrutura do Banco de Dados (5 Entidades)

O projeto cumpre o requisito de modelagem de domínio com 5 entidades inter-relacionadas:

1.  **Usuario:** Dados cadastrais (Nome, CPF).
2.  **Documento:** Regras de validação (CNH, Status Validado/Pendente).
3.  **Carteira:** Gestão de saldo financeiro.
4.  **Endereco:** Dados de logradouro.
5.  **Transacao:** Histórico de operações financeiras.

---

## ⚙️ Pré-requisitos e Configuração

Para executar o projeto localmente, certifique-se de ter instalado:
* **Java JDK 17+**
* **MySQL Server** (Rodando na porta padrão `3306`)
* **IntelliJ IDEA** (Recomendado)

### 1. Configuração do Banco
Antes de iniciar a aplicação, abra seu MySQL Workbench ou Terminal e crie o banco de dados:

```sql
CREATE DATABASE pix_db;
