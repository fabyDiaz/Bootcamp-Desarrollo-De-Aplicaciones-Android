import java.util.Scanner;
public class Vector {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int suma=0;
        System.out.println("Ingrese N");
        int N = lector.nextInt();
        int[]a= new int[N];

        for (int i=0; i<N; i++){
            System.out.println("Ingrese un número");
            a[i]=lector.nextInt();
            suma+=a[i];
        }
        System.out.println("Los nmeros ingresados son ");
        for (int i=0; i<N; i++){
            System.out.print(a[i] + " + ");
        }
        System.out.println("\n");
        System.out.println("La suma de todos los elementos es: "+suma);

    }
}
