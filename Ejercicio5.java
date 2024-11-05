import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

   
        String[] palabras = nombreCompleto.split(" ");


        String iniciales = "";


        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                iniciales += palabra.charAt(0);
            }
        }

        System.out.println("Iniciales: " + iniciales.toUpperCase());
        scanner.close();
    }
}