
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame {
    
    //Construtor
    public TelaCadastro(){
        setTitle("Cadastro de Funcionários");
        setSize(500, 300);
        setLocation(100, 100);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel lblNome;
        lblNome = new JLabel("Nome:");
        lblNome.setSize(70, 30);
        lblNome.setLocation(20, 30);
        add(lblNome);
        
        JTextField txtNome;
        txtNome = new JTextField();
        txtNome.setSize(300, 30);
        txtNome.setLocation(90, 30);
        add(txtNome);
        
        JLabel lblCargo;
        lblCargo = new JLabel("Cargo:");
        lblCargo.setSize(70, 30);
        lblCargo.setLocation(20, 70);
        add(lblCargo);
        
        JTextField txtCargo;
        txtCargo = new JTextField();
        txtCargo.setSize(300, 30);
        txtCargo.setLocation(90, 70);
        add(txtCargo);
        
        JLabel lblSalario;
        lblSalario = new JLabel("Salário:");
        lblSalario.setSize(70, 30);
        lblSalario.setLocation(20, 110);
        add(lblSalario);
        
        JTextField txtSalario;
        txtSalario = new JTextField();
        txtSalario.setSize(300, 30);
        txtSalario.setLocation(90, 110 );
        add(txtSalario);
        
        JLabel lblEmail;
        lblEmail = new JLabel("E-mail:");
        lblEmail.setSize(70, 30);
        lblEmail.setLocation(20, 150);
        add(lblEmail);
        
        JTextField txtEmail;
        txtEmail = new JTextField();
        txtEmail.setSize(300, 30);
        txtEmail.setLocation(90, 150 );
        add(txtEmail);
        
        JLabel lblTelefone;
        lblTelefone = new JLabel("Telefone:");
        lblTelefone.setSize(70, 30);
        lblTelefone.setLocation(20, 190);
        add(lblTelefone);
        
        JTextField txtTelefone;
        txtTelefone = new JTextField();
        txtTelefone.setSize(300, 30);
        txtTelefone.setLocation(90, 190 );
        add(txtTelefone);
        
        JButton btnSalvar;
        btnSalvar = new JButton();
        btnSalvar.setSize(75, 25);
        btnSalvar.setLocation(20, 230);
        btnSalvar.setText("Salvar");
        add(btnSalvar);
        
        JButton btnPesquisar;
        btnPesquisar = new JButton();
        btnPesquisar.setSize(120, 25);
        btnPesquisar.setLocation(120, 230);
        btnPesquisar.setText("Pesquisar");
        add(btnPesquisar);
    }
    
    public static void main(String[] args) {
        new TelaCadastro().setVisible(true); 
    }
    
}
