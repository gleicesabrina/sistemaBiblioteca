# 📚 Sistema de Biblioteca

Este é um sistema básico de gerenciamento de livros e exemplares de uma biblioteca, desenvolvido com **Spring Boot**.

## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- H2 Database (ou MySQL)
- Lombok
- Maven

## 📁 Estrutura Principal

- `Livro`: representa um livro com nome, editora e área do direito.
- `Exemplar`: representa uma cópia física do livro, com data de aquisição, preço pago e disponibilidade.
- Relacionamento **@OneToMany** entre Livro e Exemplares.

## 🚀 Como rodar o projeto

### Pré-requisitos

- Java JDK 17
- Maven configurado
- IDE como VS Code ou IntelliJ

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/gleicesabrina/sistemaBiblioteca.git
   cd sistemaBiblioteca
