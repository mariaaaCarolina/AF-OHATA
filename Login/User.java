package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User
 * 
 * Representa um usuário com funcionalidades para conectar ao banco de dados
 * e realizar a verificação de login e senha.
 */
public class User {

    /**
     * Método para estabelecer conexão com o banco de dados MySQL.
     * 
     * @return Um objeto {@link Connection} se a conexão for bem-sucedida, ou null caso contrário.
     */
    public Connection conectarBD() {
        Connection conn = null; // Declara a variável de conexão como null
        try {
            // Carrega o driver para conexão com o MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            
            // URL de conexão com o banco de dados
            // Inclui o endereço do servidor, nome do banco de dados, usuário e senha
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
        }
        return conn; // Retorna o objeto de conexão
    }

    /**
     * Nome do usuário verificado
     */
    public String nome = "";

    /**
     * Resultado da verificação do usuário
     * Representa se a autenticação foi bem sucedida (true) ou não (false).
     */
    public boolean result = false;

    /**
     * Método para verificar as credenciais de login do usuário.
     * 
     * @param login O nome de usuário fornecido.
     * @param senha A senha fornecida.
     * @return Retorna true se as credenciais forem válidas; caso contrário, retorna false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Declara a string para armazenar a instrução SQL
        Connection conn = conectarBD(); // Conecta ao banco de dados

        // Construção da instrução SQL para buscar o nome do usuário
        sql += "SELECT nome FROM usuarios "; // Especifica a ação e a tabela.
        sql += "WHERE login = '" + login + "'"; // Adiciona a condição de login
        sql += " AND senha = '" + senha + "';"; // Adiciona a condição de senha.

        try {
            // Cria um Statement para executar a instrução SQL.
            Statement st = conn.createStatement();
            
            // Executa a consulta SQL e armazena o resultado em um ResultSet.
            ResultSet rs = st.executeQuery(sql);
            
            // Verifica se houve algum resultado na consulta.
            if (rs.next()) {
                // Caso exista um resultado, a autenticação foi bem-sucedida.
                result = true;
                
                // Armazena o nome do usuário retornado pela consulta.
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        }
        return result; // Retorna o resultado da verificação.
    }
}
