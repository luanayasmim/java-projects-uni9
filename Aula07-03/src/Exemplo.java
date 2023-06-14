
import javax.swing.JOptionPane;


public class Exemplo {
    public static void main(String[] args) {
        String nome, cargo, telefone;
        int idade, ra;
        double salario;
        char sexo;
        
        nome = JOptionPane.showInputDialog("Informe o seu nome");
        cargo = JOptionPane.showInputDialog("Informe o seu cargo");
        telefone = JOptionPane.showInputDialog("Informe o seu telefone");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
        ra = Integer.parseInt(JOptionPane.showInputDialog("Qual é a seu ra?"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));
        sexo = JOptionPane.showInputDialog("Qual é o seu sexo?").charAt(0);
        
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " \nSeu cargo é " + cargo + " \nSeu telefone é " + telefone + " \nVocê tem " + idade + " anos " + " \nSeu Ra é " + ra + " \nVocê ganha " + salario + " \nSeu sexo é " + sexo);
        

        
    }
    
}
