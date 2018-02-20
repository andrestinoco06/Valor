import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        int num1, num2;
        Scanner S = new Scanner (System.in);
        System.out.println("Introduce el primer valor: ");
        num1 = S.nextInt();
        System.out.println("Introduce el segundo valor: ");
        num2 = S.nextInt();
        if (num1 > num2){
            System.out.println("El numero mayor es: "+num1);
            System.out.println("El numero menor es: "+num2);
        }else {
            if (num1 < num2){
                System.out.println("El numero mayor es: "+num2);
                System.out.println("El numero menor es: "+num1);
            }else {
                System.out.println("Ambos numeros son iguales");
            }    
        }
    }  
}