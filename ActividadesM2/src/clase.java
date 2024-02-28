import java.util.Scanner;

public class clase {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int num;
        int limite = 0;

        System.out.println("**");
        System.out.println("    Bienvenido al programa de sumar hasta un      ");
        System.out.println("               límite.                            ");
        System.out.println("**");

        System.out.println( "Ingrese el limite que debe tener la suma: " );

        limite = Integer.parseInt(scanner.nextLine());

        System.out.println( "Ingrese el numero que desea ir sumando: " );

        num = Integer.parseInt(scanner.nextLine());

        while( suma <= limite){
            suma = num + suma;
            System.out.println("La sumatoria hasta ahora es: " + suma);
        }

        System.out.println("La suma de los números ingresados supera el límite de" + limite);

    }

}
