import java.util.Scanner;

public class InteraccionUsuario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Acontinuación se le solicitaran tres palabras");
        System.out.println("Introduzca la primera palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.println("Introduzca la segunda palabra: ");
        String palabra2 = entrada.nextLine();
        System.out.println("Introduzca la tercera palabra: ");
        String palabra3 = entrada.nextLine();

        System.out.println(palabra1+""+palabra2+""+palabra3);

        entrada.close();
    }
}