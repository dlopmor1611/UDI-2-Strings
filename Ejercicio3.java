import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        char caracter = ' ';
        boolean caracterValido = false;
        while (!caracterValido) {
            System.out.print("Introduce un carácter: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                caracter = input.charAt(0);
                caracterValido = true;
            } else {
                System.out.println("Por favor, introduce solo un carácter.");
            }
        }
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
        scanner.close();
    }
}
