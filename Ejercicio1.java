import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.println(caracter);
        }
        
        scanner.close();
    }
}