import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        int edad;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese edad");
        edad= lector.nextInt();
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
