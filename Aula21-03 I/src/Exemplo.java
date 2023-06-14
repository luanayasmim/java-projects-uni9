
import javax.swing.JOptionPane;

public class Exemplo {

    public static void main(String[] args) {
        String nome;
        byte idade;
        double salario;
        
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a sua idade:"));
        salario = Double.parseDouble((JOptionPane.showInputDialog("Digite o seu salário:")));
    }
    
}
