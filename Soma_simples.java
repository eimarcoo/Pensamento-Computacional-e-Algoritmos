import java.util.Scanner;

public class Soma_simples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        

        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo numero:");
        n2 = input.nextFloat();

        float total = (n1+n2);

        System.out.println("Soma = "+total);

    }

}