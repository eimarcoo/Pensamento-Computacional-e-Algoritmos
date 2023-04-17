import java.util.Scanner;

public class Hello_Wolrd {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome:");
        nome = input.nextLine();

        System.out.println("Digite sua idade:");
        idade = input.nextInt();

        System.out.println("Olá "+nome+", você tem "+idade+" anos.");

    }

}