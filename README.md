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

Passo 3: Configurar e Rodar o Backend (Java)
Abra a pasta do projeto no IntelliJ IDEA.

Aguarde o Maven carregar as dependências.

Abra o arquivo src/main/resources/application.properties.

Verifique a senha do banco:

Se a senha do seu MySQL for root, não precisa mudar nada.

Se for diferente, altere a linha: spring.datasource.password=SUA_SENHA.

Localize a classe PixValidacaoApplication.java e clique no botão Play (Run).

Espere aparecer no console a mensagem: Tomcat started on port 8080.

4️⃣ Passo 4: Acessar o Sistema (Frontend)
Com o backend rodando, abra seu navegador (Google Chrome, Edge, etc.) e acesse:

👉 http://localhost:8080

🧪 Como Testar (Cenários de Uso)
O sistema já vem com dados fictícios inseridos automaticamente (DataLoader) para demonstrar o funcionamento. Use os CPFs abaixo para testar:

Cenário	CPF para Digitar	Resultado Esperado
✅ APROVADO	123.456.789-00	
Usuário: João Silva.


A CNH está válida. O sistema mostra ✅ e libera o botão "Continuar".

🚫 BLOQUEADO	111.222.333-44	
Usuária: Maria Souza.


A CNH está inválida/pendente. O sistema mostra 🚫 e bloqueia o botão.

⚠️ NÃO ENCONTRADO	000.000.000-00	
CPF Inexistente.


O sistema avisa que o usuário não existe na base.


Exportar para as Planilhas

🗂️ Estrutura Técnica (5 Entidades)
O projeto cumpre o requisito acadêmico de possuir 5 entidades de domínio inter-relacionadas:

Usuario: Cliente do banco (Nome, CPF).

Documento: Regra de negócio (CNH, Status Validado).

Carteira: Saldo financeiro.

Endereco: Dados de localização.

Transacao: Histórico de transferências.

🔌 Documentação da API (Endpoints)
Além do site, o sistema possui uma API REST completa para gerenciamento (CRUD).

Validação (Usada pelo Site):

GET /api/validar/{cpf}

Administração (CRUD Completo):

GET /api/admin/usuarios

GET /api/admin/documentos

GET /api/admin/carteiras

GET /api/admin/enderecos

GET /api/admin/transacoes

👥 Autores
Equipe do Projeto A3 - UniCuritiba

Andrey

Gustavo

Matheus

Projeto desenvolvido para fins acadêmicos - 2025.


***

### ⚠️ Não esqueça!
Depois de colar esse novo texto no IntelliJ:
1.  Aperte `Ctrl + K` (Commit).
2.  Escreva "Atualizando README com passo a passo".
3.  Clique em **Commit and Push**.

Agora seu GitHub vai ter a documentação perfeita! 🚀
