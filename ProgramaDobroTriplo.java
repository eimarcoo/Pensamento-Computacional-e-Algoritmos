import java.util.Scanner;

public class ProgramaDobroTriplo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;

        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextFloat();


        if (n1 >= 0){
            System.out.println("Dobro = "+(n1*2));
        }else {
            System.out.println("Triplo = "+(n1*3));
        }

    }

}