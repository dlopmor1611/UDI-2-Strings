import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        boolean caracterV1 = false;
        boolean caracterV2 = false;
        char caracter1 = ' ';
        char caracter2 = ' ';

        while (!caracterV1) {
            System.out.print("Introduce un carácter: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                caracter1 = input.charAt(0);
                caracterV1 = true;
            } else {
                System.out.println("Por favor, introduce solo un carácter.");
            }
        }

        while (!caracterV2) {
            System.out.print("Introduce otro carácter: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                caracter2 = input.charAt(0);
                caracterV2 = true;
            } else {
                System.out.println("Por favor, introduce solo un carácter.");
            }
        }

            String cadena2= cadena.replace(caracter1, caracter2);
            System.out.print("La cadena cambiando " + caracter1 + " por " + caracter2 + " es: " + cadena2);
            
            scanner.close();
    }
}