package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
        return conectado;   
    }
    
    public static void Salvar(String usuario, String senha, String cpf) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO tbl_usuarios VALUES(?, ?, ?);");
            
        stSalvar.setString(1, usuario);
        stSalvar.setString(2, senha);
        stSalvar.setString(3, cpf);

        stSalvar.executeUpdate();
    }
    
    public static ResultSet Consultar(String usuario) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select * from tbl_usuarios where usuario = ?");
        stConsultar.setString(1, usuario);
            
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static void Alterar(String usuario, String senha, String cpf) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE tbl_usuarios SET senha = ?, cpf_funcionario = ?  WHERE usuario = ?");
        
        stAlterar.setString(1, senha);
        stAlterar.setString(2, cpf);
        stAlterar.setString(3, usuario);
        
        stAlterar.executeUpdate();
    }
    
    public static void Excluir(String usuario) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM tbl_usuarios WHERE usuario = ?");
        
        stExcluir.setString(1, usuario);
        
        stExcluir.executeUpdate();
    }
    
    public static ResultSet ListarTudo() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select u.usuario, u.senha, u.cpf_funcionario as cpf, f.cargo from tbl_usuarios u inner join tbl_funcionarios f on u.cpf_funcionario = f.cpf");
        ResultSet resultado = stConsultar.executeQuery();
            
        return resultado;
    }
    
    public static ResultSet PesquisarPorCargo(String cargo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select u.usuario, u.senha, u.cpf_funcionario as cpf, f.cargo from tbl_usuarios u inner join tbl_funcionarios f on u.cpf_funcionario = f.cpf where f.cargo = ?");
        stConsultar.setString(1, cargo);
        ResultSet resultado = stConsultar.executeQuery();
              
        return resultado;
    }
    
    public static ResultSet PesquisarPorUsuario(String usuario) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select u.usuario, u.senha, u.cpf_funcionario as cpf, f.cargo from tbl_usuarios u inner join tbl_funcionarios f on u.cpf_funcionario = f.cpf where u.usuario like ?");
        stConsultar.setString(1, "%" + usuario + "%" );
        ResultSet resultado = stConsultar.executeQuery(); 
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorSenha(String senha) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select u.usuario, u.senha, u.cpf_funcionario as cpf, f.cargo from tbl_usuarios u inner join tbl_funcionarios f on u.cpf_funcionario = f.cpf where u.senha like ?");
        stConsultar.setString(1, "%" + senha + "%" );
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorCpf(String cpf) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select u.usuario, u.senha, u.cpf_funcionario as cpf, f.cargo from tbl_usuarios u inner join tbl_funcionarios f on u.cpf_funcionario = f.cpf where u.cpf_funcionario like ?");
        stConsultar.setString(1, "%" + cpf + "%" );
        ResultSet resultado = stConsultar.executeQuery(); 
        
        return resultado;
    }
}
