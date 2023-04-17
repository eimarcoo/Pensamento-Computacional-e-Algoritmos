import java.util.Scanner;

public class ProgramaSoma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        

        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo numero:");
        n2 = input.nextFloat();

        if (n1 > n2){
            System.out.println("Soma = "+(n1+n2));
        }else {
            System.out.println("Multiplicacao = "+(n1*n2));
        }

    }

}