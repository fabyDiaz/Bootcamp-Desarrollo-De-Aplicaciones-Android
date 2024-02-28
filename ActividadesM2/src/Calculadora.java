import java.util.Scanner;

public class Calculadora {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int operacion;
        int continuar = 1;
        int a;
        int b;

        do{

            a = validarNumero();
            b = validarNumero();

            System.out.println("Ingresa la operación que quieres realizar");
            System.out.println("1.Suma\n2.Resta\n3.Multiplicación\n4.División");
            operacion = lector.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " x " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                default:
                    System.out.println("operacion ingresada no es válida");
            }

            System.out.println("Desea realizar otra operación\n1.Si\n2.No");
            continuar = lector.nextInt();

        }while(continuar==1);
    }


    public static int validarNumero(){
        int n=0;
        System.out.println("Ingresa dos números");
        do{
            System.out.println("número:");
            while (!lector.hasNextInt()) {
                System.out.println("Ingrese un número entero positivo");
                lector.next(); // Limpiar el buffer de entrada
            }
            n = lector.nextInt();
            if(n<=0){
                System.out.println("Debe ingresar un número mayor que 0");
            }
        }while(n<=0);
        return n;
    }
}
