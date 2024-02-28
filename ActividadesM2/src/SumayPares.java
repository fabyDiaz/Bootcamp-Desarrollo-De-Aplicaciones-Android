public class SumayPares {

    public static void main(String[] arg){

        System.out.println("SUMA DEL 1 AL 10");
        int suma=0;
        for (int i=1;i<=10;i++){
            suma+=i;
        }
        System.out.println("La suma de los números del 1 al 10 son: "+suma);

        System.out.println("========================================================");
        System.out.println("IMPRIMIR PARES");

        for (int i=0;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
