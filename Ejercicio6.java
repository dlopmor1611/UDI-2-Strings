import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        String cadenaInvertida = "";
        

        for (int i = 0; i < cadena.length(); i++) {
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }
        
        System.out.print("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
    }
}