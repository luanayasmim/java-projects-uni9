
import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        //Declaração de variáveis
        String nome;
        byte idade;
        double salario;

        Scanner scn;
        scn = new Scanner(System.in);

        //Cadastro de valores (Entrada de dados)
        System.out.print("Digite seu nome: ");
        nome = scn.nextLine(); //armazenar a resposta como String
        System.out.print("Digite sua idade: ");
        idade = scn.nextByte(); //armazenar a resposta como byte
        System.out.print("Digite seu salário: ");
        salario = scn.nextDouble(); //armazenar a resposta como double

        //Exibe os dadops cadastrados
        System.out.print(
                "Nome: " + nome
                + "\nIdade: " + idade
                + "\nsalário: " + salario
        );

    }

}
