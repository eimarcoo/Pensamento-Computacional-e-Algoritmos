import java.util.Scanner;

public class ConverterTemp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int entrada;
        float t;
        int cond;
        
        System.out.println("Digite a forma da temperatura de origem: \n1 - Celsius \n2 - Fahrenheit \n3 - Kelvin ");
        entrada = input.nextInt();
        
        System.out.println("Digite a temperatura: ");
        t = input.nextFloat();

        System.out.println("Digite a forma de conversão: \n1 - Celsius \n2 - Fahrenheit \n3 - Kelvin ");
        cond = input.nextInt();
        
        float fc = (((t-32)*5)/9);
        float fk = ((((t-32)*5)/9)+273);
        float kc = (t-273);
        float kf = ((((t-273)*9)/5)+32);
        float cf = (((t*9)/5)+32);
        float ck = (t+273);

        if (entrada == 1 && cond == 1){
            System.out.println("Temperatura em Celsius = "+t);
        }else if (entrada == 2 && cond  == 2){
            System.out.println("Temperatura em Fahrenheit = "+t);
        }else if (entrada == 3 && cond  == 3){
            System.out.println("Temperatura em Kelvin = "+t);
        }else if (entrada == 1 && cond  == 2){
            System.out.println("Temperatura em Fahrenheit = "+cf);
        }else if (entrada == 1 && cond  == 3){
            System.out.println("Temperatura em Kelvin = "+ck);
        }else if (entrada == 2 && cond  == 1){
            System.out.println("Temperatura em Celsius = "+fc);
        }else if (entrada == 2 && cond  == 3){
            System.out.println("Temperatura em Kelvin = "+fk);
        }else if (entrada == 3 && cond  == 1){
            System.out.println("Temperatura em Celsius = "+kc);
        }else if (entrada == 3 && cond  == 2){
            System.out.println("Temperatura em Fahrenheit = "+kf);
        } else{
            System.out.println("Entrada inválida");
        }

    }
}