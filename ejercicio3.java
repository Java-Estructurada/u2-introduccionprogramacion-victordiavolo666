import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad total de segundos: ");
        int totalSegundos = scanner.nextInt();
        int dias= totalSegundos / 86400;
        int resto= totalSegundos % 86400;
        int horas= resto / 3600;
        resto = resto % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        System.out.println("Conversión de " + totalSegundos + " segundos ---");
        System.out.println(dias + " días : " + horas + " horas : " + minutos + " minutos : " + segundos + " segundos");
    }
}  