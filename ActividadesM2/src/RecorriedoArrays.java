import java.util.Scanner;

public class RecorriedoArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String paises[]= new String[5];

        for (int i=0;i<5;i++){
            System.out.println("Ingrese un país");
            paises[i]=scanner.nextLine();
        }
        System.out.println("Los paises ingresados son: ");
        for (int i=0;i<5;i++){
            System.out.println(paises[i]);
        }


    }
}
