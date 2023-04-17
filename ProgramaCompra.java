import java.util.Scanner;

public class ProgramaCompra {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1;
        int pagamento;
        int parc;

        System.out.println("Digite o valor do produto: ");
        n1 = input.nextFloat();

        System.out.println("Digite a forma de pagamento: \n1 - A VISTA \n2 - PIX \n3 - DEBITO \n4 - CREDITO");
        pagamento = input.nextInt();
       
        if (pagamento == 4) {
            System.out.println("Parcelamento: \n1 - A vista \n2 - 2x com juros \n3 - 3x com juros \n4 - 4x com juros \n5 - 5x com juros \n6 - 6x com juros \n7 - 7x com juros \n8 - 8x com juros \n9 - 9x com juros \n10 - 10x com juros");
            parc = input.nextInt();
            if (parc == 1) {
                System.out.println(parc + " parcelas de " + n1 + "\nTotal = "+ n1);
            }
            else if (parc >= 2) {
                System.out.println(parc + " parcelas de " + ((n1+(n1*0.1*parc))/parc) + "\nTotal = "+(n1+(n1*0.1*parc)));
            }
           
        }
        else if (pagamento == 1){
            System.out.println("Total = "+(n1-(n1*0.1)));
        }else if (pagamento == 2){
            System.out.println("Total = "+(n1-(n1*0.1)));
        }else if (pagamento == 3){
            System.out.println("Total = "+(n1-(n1*0.1)));
        }

    }

}
