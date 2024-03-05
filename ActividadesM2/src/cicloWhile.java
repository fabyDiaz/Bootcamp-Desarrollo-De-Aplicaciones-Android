import java.util.Scanner;

/*El usuario debe ingresar un número hasta que ingrese 0 o 100*/

public class cicloWhile {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int num=0;
        boolean bandera=true;

       do{
            System.out.println("ingrese número");
            num = scanner.nextInt();
        }while(num!=0 && num!=100);

       /* while(bandera==true){
            bandera=true;
            System.out.println("ingrese número");
            num = scanner.nextInt();
            if(num==0 || num==100){
                bandera=false;
            }
        }*/

    }
}
