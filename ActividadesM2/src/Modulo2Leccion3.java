import java.util.Scanner;

public class Modulo2Leccion3 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("DESAFÍO 1");
        int a;
        int b;

        System.out.println("Ingrese el primer número");
        a=Integer.parseInt(lector.nextLine());
        System.out.println("Ingrese el segundo número");
        b= Integer.parseInt(lector.nextLine());

        System.out.println(a+" + "+b+" = "+ (a+b));

        lector.next();

        System.out.println("\n\n\nDESAFIO 2");


        String frase;

        System.out.println("Ingrese una frase");
        frase=lector.nextLine();
        System.out.println("======================================");
        System.out.println(frase.toUpperCase());
        System.out.println("======================================");
        System.out.println(frase.toLowerCase());

    }
}
