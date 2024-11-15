Maria Carolina de Oliveira Barbosa - 235810

Erros identificados:

- Na linha: Class.forName("com.mysql.Driver.Manager").newInstance();, não é regular o Driver.Manager para executar a conexão do banco de dados.
  Erro: java.lang.ClassNotFoundException: com.mysql.Driver.Manager
  em java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
  em java.base/jdk.internal.loader.ClassLoaders$AppClassLoader .loadClass(ClassLoaders.java:188) ]
  em java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
  em java.base/java.lang.Class.forName0(Método Nativo)
  em java.base/java .lang.Class.forName(Class.java:391)
  em java.base/java.lang.Class.forName(Class.java:382)
  em login.User.conectarBD(User.java:11)
  em login.User. VerificarUsuario(User.java:23)
  em login.main.main(main.java:9)

- O código também apresenta um erro ao chamar a função verificarUsuario(), que ocorre devido ao problema na função conectarBD(), mencionado anteriormente, causado pelo não reconhecimento do Driver.Manager
- No final do código, ao imprimir um resultado variável, o console retorna false porque a conexão com o banco de dados não foi estabelecida, o que impede a execução da consulta.

Link plano de testes, com o teste estático do código: https://docs.google.com/spreadsheets/d/1RjKMKughNaGOoehoagqGEK7g7V-nr3_D/edit?usp=sharing&ouid=118297399208605566763&rtpof=true&sd=true
