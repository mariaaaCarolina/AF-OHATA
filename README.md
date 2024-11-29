Maria Carolina de Oliveira Barbosa - 235810

# Erros identidificados: 

- Na linha: Class.forName("com.mysql.Driver.Manager").newInstance();, não reconhece o Driver.Manager para executar a conexão do banco de dados, gerando um erro "ClassNotFoundException", é sugerido o uso de **com.mysql.cj.jdbc.Driver**;

- O código também apresenta um erro ao chamar a função verificarUsuario(), que ocorre devido ao problema na função conectarBD(), que retorna null (devido a falha na conexão) e ao executar o método passando a conexão como nula gera um NullPointerException;
  
- No final do código, ao imprimir a variável result, o console retorna false porque a conexão com o banco de dados não foi estabelecida, o que impede a execução correta da consulta;

- Não há uma classe Main para a compilação do código Login.User;

- Não há tratamento de exceções nos blocos Catch;

- A consulta SQL não é segura contra SQL Injections;

- A conexão em nenhum momento é fechada.
  
## **Plano de Testes - estático:**
![plano de testes](./images/plano%20de%20testes.png)

**Link do plano de testes**: https://docs.google.com/spreadsheets/d/1RjKMKughNaGOoehoagqGEK7g7V-nr3_D/edit?usp=sharing&ouid=118297399208605566763&rtpof=true&sd=true
