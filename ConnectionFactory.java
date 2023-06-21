package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
/*    private static String usuario = "root";
    private static String senha = "anima123";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "SPT_ESPORTES";*/
   
    private static String usuario = "root";
    private static String senha = "1234";
    private static String host = "127.0.0.1";
    private static String porta = "3306";
    private static String bd = "SPT_ESPORTES";

    
    
    public static Connection obtemConexao() throws Exception {
        try {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
