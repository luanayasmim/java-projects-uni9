package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.Funcionario;

public class FuncionarioDao {
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
        return conectado;   
    }
    
    public static void Salvar(Funcionario funcionario) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO tbl_funcionarios VALUES(?, ?, ?, ?, ?);");
        stSalvar.setString(1, funcionario.getCpf());
        stSalvar.setString(2, funcionario.getNome());
        stSalvar.setDouble(3, funcionario.getSalario());
        stSalvar.setString(4, funcionario.getCargo());
        stSalvar.setInt(5, funcionario.getCod_departamento());
        
        stSalvar.executeUpdate();
    }
    
    public static ResultSet Consultar(String cpf) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("select * from tbl_funcionarios where cpf = ?");
        stConsultar.setString(1, cpf);
            
        ResultSet resultado = stConsultar.executeQuery();
            
        return resultado;
    }
    
    
    public static void Alterar(Funcionario funcionario) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stAlterar = conectado.prepareStatement("UPDATE tbl_funcionarios SET nome = ?, salario = ?, cargo = ?, cod_departamento = ? WHERE cpf = ?");
        
        stAlterar.setString(1, funcionario.getNome());
        stAlterar.setDouble(2, funcionario.getSalario());
        stAlterar.setString(3, funcionario.getCargo());
        stAlterar.setInt(4, funcionario.getCod_departamento());
        stAlterar.setString(5, funcionario.getCpf());
        
        stAlterar.executeUpdate();
    }
    
    public static void Excluir(String cpf) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM tbl_funcionarios WHERE cpf = ?");
        stExcluir.setString(1, cpf);
        
        stExcluir.executeUpdate();
    }
    
    public static ResultSet ListarTudo() throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo");
        ResultSet resultado = stConsultar.executeQuery(); 
            
        return resultado;
    }
    
    public static ResultSet PesquisarPorCpf(String cpf) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.cpf like ?");
        stConsultar.setString(1, "%" + cpf + "%" );
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorNome(String nome) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.nome like ?");
        stConsultar.setString(1, "%" + nome + "%" );
        ResultSet resultado = stConsultar.executeQuery();
        
        return resultado;
    }
    
    public static ResultSet PesquisarPorSalario(String salario) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.salario like ?");
        stConsultar.setString(1, "%" + salario + "%" );
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
    
    public static ResultSet PesquisarPorCargo(String cargo) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo WHERE f.cargo = ?");
        stConsultar.setString(1, cargo);
         ResultSet resultado = stConsultar.executeQuery();
            
        return resultado;
    }
    
    public static ResultSet PesquisarPorDepartamento(String departamento) throws ClassNotFoundException, SQLException{
        Connection conectado = conectar();
        
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where d.nome like ?");
        stConsultar.setString(1, "%" + departamento + "%" );
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
}
