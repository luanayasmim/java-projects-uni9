
import javax.swing.JOptionPane;

//Aula 03/03/2023

public class Exemplo {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String profession = JOptionPane.showInputDialog("What is your profession?");
        JOptionPane.showMessageDialog(null, "My name is " + name);
        JOptionPane.showMessageDialog(null, "My profession is " + profession);
    }
    
}
