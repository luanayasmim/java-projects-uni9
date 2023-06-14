import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
        //Declarando as variáveis
        long idade;
        String endereco;
        float salario;
        //Entrada de dados
        idade = Long.parseLong(JOptionPane.showInputDialog("Qual sua idade?"));
        endereco = JOptionPane.showInputDialog("Qual seu endereço?");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salário"));
//        byte idade1 = Byte.parseByte(JOptionPane.showInputDialog("Qual é a sua idade?"));
//        long idade;
//        String endereco;
//        idade = Long.parseLong(JOptionPane.showInputDialog("Qual sua idade?"));
//        endereco = JOptionPane.showInputDialog("Qual seu endereço?");
    }
    
}
