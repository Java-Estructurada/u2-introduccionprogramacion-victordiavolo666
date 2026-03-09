import java.util.Scanner;
class ope {
    public static double cuadrado(double num) {
        return num*num;
    }
}
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1:");
        double x1 = entrada.nextDouble();
        System.out.println("Ingrese el valor de y1:");
        double y1 = entrada.nextDouble();
        System.out.println("Ingrese el valor de x2:");
        double x2 = entrada.nextDouble();
        System.out.println("Ingrese el valor de y2:");
        double y2 = entrada.nextDouble();
        double restaX = x2 - x1;
        double restaY = y2 - y1;
        double cuadradoX = ope.cuadrado(restaX);
        double cuadradoY = ope.cuadrado(restaY);
        double suma = cuadradoX + cuadradoY;
        double distancia = Math.sqrt(suma);
        System.out.println("La distancia entre los puntos es: " + distancia);

    }
}