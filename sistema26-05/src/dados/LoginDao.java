package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDao {
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
        return conectado;   
    }
    
    public static ResultSet Logar(String usuario, String senha) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stEntrar = conectado.prepareStatement("select * from tbl_usuarios where usuario = ? and senha = ?");
        stEntrar.setString(1, usuario);
        stEntrar.setString(2, senha);
            
        ResultSet resultado = stEntrar.executeQuery();
        
        return resultado;
    }
}
