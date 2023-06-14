package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import models.Departamento;

public class DepartamentoDao {
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
        return conectado;   
    }
    
    public static void Salvar(Departamento departamento) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stSalvarDep = conectado.prepareStatement("INSERT INTO tbl_departamentos VALUES(?, ?, ?, ?)");
        stSalvarDep.setInt(1, departamento.getCodigo());
        stSalvarDep.setString(2, departamento.getNome());
        stSalvarDep.setString(3, departamento.getCidade());
        stSalvarDep.setString(4, departamento.getTelefone());
        
        stSalvarDep.executeUpdate();
    }
    
    public static ResultSet Consultar(String codigo) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select * from tbl_departamentos where codigo = ?");
        stConsultar.setInt(1, Integer.parseInt(codigo));
            
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado; 
    }
    
    public static void Alterar(Departamento departamento) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE tbl_departamentos SET nome = ? , cidade = ? , telefone = ? WHERE codigo = ?");
        
        stAlterar.setString(1, departamento.getNome());
        stAlterar.setString(2, departamento.getCidade());
        stAlterar.setString(3, departamento.getTelefone());
        stAlterar.setInt(4, departamento.getCodigo());
        
        stAlterar.executeUpdate();
    }
    
    public static void Excluir(String codigo) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM tbl_departamentos WHERE codigo = ?");
        stExcluir.setString(1, codigo);
        
        stExcluir.executeUpdate();
    }
    
    public static ResultSet ListarTudo() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM tbl_departamentos");
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorCodigo(String codigo) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM tbl_departamentos WHERE codigo = ?");
        stConsultar.setString(1, codigo);
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorNome(String nome) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM tbl_departamentos WHERE nome LIKE ?");
        stConsultar.setString(1, "%" + nome + "%");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }

    public static ResultSet PesquisarPorCidade(String cidade) throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM tbl_departamentos WHERE cidade = ?");
        stConsultar.setString(1, cidade);
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
}