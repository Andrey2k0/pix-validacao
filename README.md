# Projeto A3: Sistema de Validação de Segurança Pix

Este projeto é um protótipo de sistema bancário desenvolvido para a Atividade Avaliativa A3. O objetivo é mitigar fraudes no Pix impedindo transferências de usuários que não possuem a documentação (CNH) validada no sistema.

## 🚀 Tecnologias Utilizadas
- **Backend:** Java 17 + Spring Boot 3.x
- **Banco de Dados:** MySQL 8.0
- **Frontend:** HTML5, CSS (Tailwind) e JavaScript Vanilla
- **ORM:** Hibernate/JPA
- **Build:** Maven

## 📋 Pré-requisitos
Para rodar este projeto, você precisa ter instalado:
1.  **Java JDK 17** ou superior.
2.  **MySQL Server** rodando na porta `3306`.
3.  **IntelliJ IDEA** (ou outra IDE Java).

## ⚙️ Configuração do Banco de Dados
O sistema utiliza o banco de dados MySQL. Antes de rodar, execute o seguinte comando no seu MySQL Workbench ou Terminal:

```sql
CREATE DATABASE pix_db;