import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        int op;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextFloat();

        System.out.println("Digite a operação: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
        op = input.nextInt();

        if (op == 1){
            System.out.println("Soma = "+(n1+n2));
        }else if (op == 2){
            System.out.println("Subtração = "+(n1-n2));
        }else if (op == 3){
            System.out.println("Multiplicação = "+(n1*n2));
        }else if (op == 4){
            System.out.println("Divisão = "+(n1/n2));
        }

    }
    
}