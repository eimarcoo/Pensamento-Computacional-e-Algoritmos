import java.util.Scanner;

public class ProgramaParImpar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1;
        
        System.out.println("Digite o numero: ");
        n1 = input.nextInt();


        if (n1 % 2 == 0){
            System.out.println("Numero Par");
        }else {
            System.out.println("Numero Impar");
        }

    }

}