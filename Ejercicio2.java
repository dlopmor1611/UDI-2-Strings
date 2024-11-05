import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Introduce una cadena: ");
    String cadena = scanner.nextLine();

    System.out.print("Introduce otra cadena: ");
    String cadena2 = scanner.nextLine();

        if (cadena.startsWith(cadena2)==true) {
             System.out.print("La cadena empieza por la subcadena ");
        } else {
            System.out.print("La cadena NO empieza por la subcadena ");
        }

        scanner.close();
    }

}