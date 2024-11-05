import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        cadena = cadena.toLowerCase();

        cadena = cadena.replaceAll("\\W", "");

        boolean esPalindromo = new StringBuilder(cadena).reverse().toString().equals(cadena);

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}