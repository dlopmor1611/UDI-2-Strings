import java.util.Scanner;
public class Ejercicio4 {
       
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

            int contador = 1;    
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    contador++;
            }
        }

        System.out.println("Existen " + contador + " palabras");
        scanner.close();
    }
            
}    
      
       