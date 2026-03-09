import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de dinero: $");
        int monto = scan.nextInt();
        int b100 = monto / 100;
        int resto = monto % 100;
        int b50 = resto / 50;
        resto = resto % 50;
        int b20 = resto / 20;
        resto = resto % 20;
        int m5 = resto / 5;
        resto = resto % 5;
        int m2 = resto / 2;
        resto = resto % 2;
        int m1 = resto;

        System.out.println("Descomposición de $" + monto );
        System.out.println("Billetes de $100: " + b100);
        System.out.println("Billetes de $50:  " + b50);
        System.out.println("Billetes de $20:  " + b20);
        System.out.println("Monedas de $5:    " + m5);
        System.out.println("Monedas de $2:    " + m2);
        System.out.println("Monedas de $1:    " + m1);
    }
}