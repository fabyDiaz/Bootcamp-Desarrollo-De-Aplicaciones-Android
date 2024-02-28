import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String password=null;
        Boolean correcto = false;
        Scanner lector = new Scanner(System.in);

        while (correcto==false){
            System.out.println("Ingrese contraseña");
            if(lector.hasNext()){
                password= lector.nextLine();
                if(password.equals("contraseña")){
                    correcto=true;
                    System.out.println("Has ingresado la contraseña correcta");                }
                else{
                    System.out.println("La contraseña no es correcta, inténtalo denuevo");
                }
            }
        }
        System.out.println("Bienvenido!");

    }
}
