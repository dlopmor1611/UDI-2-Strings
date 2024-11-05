import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena2="";
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        char caracter = ' ';
        for (int i = 0; i < cadena.length(); i++) {
            
            if (Character.isUpperCase(cadena.charAt(i))) {
                cadena2 += Character.toLowerCase(cadena.charAt(i));
            } else if (Character.isLowerCase(cadena.charAt(i))) {
                cadena2 += Character.toUpperCase(cadena.charAt(i));
            } else {
                cadena2 += cadena.charAt(i);
            }
      
        }
    
        System.out.println("La cadena al cambiar maysculas por minusculas es: " + cadena2);
        scanner.close();
    }
}