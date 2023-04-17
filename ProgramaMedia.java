import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        float n3;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = input.nextFloat();

        float media = ((n1+n2*2+n3*3)/6);

        if (media >= 90){
            System.out.println("A - Aprovado");
        }else if (media >= 75 && media < 90 ){
            System.out.println("B - Aprovado");
        }else if (media >= 60 && media < 75 ){
            System.out.println("C - Aprovado");
        }else if (media >= 40 && media < 60 ){
            System.out.println("D -Reprovado");
        }else if (media <40 ){
            System.out.println("E - Reprovado");
        }

    }

}