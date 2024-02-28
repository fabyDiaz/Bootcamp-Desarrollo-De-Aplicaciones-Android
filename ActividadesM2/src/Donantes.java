import java.sql.SQLOutput;
import java.util.Scanner;

public class Donantes {
    public static void main(String[] args) {

        int edad;
        double peso;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese edad");
        edad= lector.nextInt();
        System.out.println("Ingrese peso");
        peso= lector.nextInt();

        if(edad>=18 && edad<=65 && peso>=50){
            System.out.println("Cumple con todos los requisitos");
            System.out.println("Puede donar");

        }else if (edad>=18 && edad<=65 && peso>=50){
            System.out.println("Cumple con requisito de edad, pero no cumple con el requisito del peso");
            System.out.println("no puede donar");
        }else{
            System.out.println("No cumple con los requisitos");
            System.out.println("No puede donar");
        }


    }
}
