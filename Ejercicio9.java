import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();

        System.out.print("Ingrese la subcadena a buscar: ");
        String subcadena = scanner.nextLine();

        boolean contiene = cadenaPrincipal.contains(subcadena);

        if (contiene) {
            System.out.println("La cadena principal contiene la subcadena.");
        } else {
            System.out.println("La cadena principal no contiene la subcadena.");
        }
    }
}