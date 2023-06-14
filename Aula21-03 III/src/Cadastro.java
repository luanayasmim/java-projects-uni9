import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

    public Cadastro() {
        //Gerar a janela
        setSize(700, 400);
        setTitle("Cadastro de funcionários");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //Pedir o nome
        JLabel lblNome;
        lblNome = new JLabel("Nome:");
        lblNome.setSize(80, 30);
        lblNome.setLocation(20, 20);
        lblNome.setFont(new Font("Calibri", 1, 18));
        lblNome.setForeground(Color.blue);
        add(lblNome);

        JTextField txtNome;
        txtNome = new JTextField();
        txtNome.setSize(300, 30);
        txtNome.setLocation(100, 20);
        txtNome.setBackground(Color.lightGray);
        txtNome.setForeground(Color.black);
        txtNome.setFont(new Font("Verdana", 2, 18));
        add(txtNome);

        //Pedir o idade
        JLabel lblIdade;
        lblIdade = new JLabel("Idade:");
        lblIdade.setSize(80, 30);
        lblIdade.setLocation(20, 70);
        lblIdade.setFont(new Font("Calibri", 1, 18));
        lblIdade.setForeground(Color.blue);
        add(lblIdade);

        JTextField txtIdade;
        txtIdade = new JTextField();
        txtIdade.setSize(300, 30);
        txtIdade.setLocation(100, 70);
        txtIdade.setBackground(Color.lightGray);
        txtIdade.setForeground(Color.black);
        txtIdade.setFont(new Font("Verdana", 2, 18));
        add(txtIdade);

        //Pedir o salario
        JLabel lblSalario;
        lblSalario = new JLabel("Salário:");
        lblSalario.setSize(80, 30);
        lblSalario.setLocation(20, 120);
        lblSalario.setFont(new Font("Calibri", 1, 18));
        lblSalario.setForeground(Color.blue);
        add(lblSalario);

        JTextField txtSalario;
        txtSalario = new JTextField();
        txtSalario.setSize(300, 30);
        txtSalario.setLocation(100, 120);
        txtSalario.setBackground(Color.lightGray);
        txtSalario.setForeground(Color.black);
        txtSalario.setFont(new Font("Verdana", 2, 18));
        add(txtSalario);

        JButton btnSalvar;
        btnSalvar = new JButton("Salvar");
        btnSalvar.setSize(100, 30);
        btnSalvar.setLocation(20, 170);
        add(btnSalvar);

    }

    public static void main(String[] args) {
        new Cadastro().setVisible(true);
    }

}
