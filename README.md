Maria Carolina de Oliveira Barbosa - 235810

# Projeto de Verificação de Usuário

Este repositório contém uma classe em Java que implementa funcionalidades para:

1. Conexão ao banco de dados MySQL.
2. Verificação de login e senha de um usuário no sistema.

## Funcionalidades

- **Conexão ao Banco de Dados:** O método `conectarBD` estabelece uma conexão com um banco de dados MySQL usando o driver JDBC.
- **Autenticação de Usuário:** O método `verificarUsuario` realiza a autenticação de um usuário no banco de dados com base nas credenciais fornecidas.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.
- Banco de dados MySQL configurado e acessível.
- Dependência do driver JDBC do MySQL.

## Como Executar

1. Certifique-se de que o banco de dados está ativo e acessível.
2. Configure a URL de conexão com o banco no método `conectarBD`, ajustando:
   - Endereço do banco (`127.0.0.1`).
   - Nome do banco de dados (`test`).
   - Usuário e senha (`lopes` e `123`).

3. Compile e execute o código da classe.

## Estrutura do Código

- **Pacote `Login`:** Contém a classe `User`.
- **Classe `User`:** Implementa métodos para conexão e autenticação.

