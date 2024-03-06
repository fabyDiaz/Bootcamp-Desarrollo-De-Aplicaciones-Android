/*
    Metodos de la clase Math
    Math.ceil() /redonde hacia arriba
    Math.floor() //redonde hacia abajo
    Math.round() //redonde al numero más cercano
    Math.pow()  //Potencia
    Math.sqrt() //raiz
    Math.cbrt() //Raiz cubica
    Math.random // números aleatorios
    Math.min()  // el numero menor entre dos valores
    Math.max()  //el numero mayor entre dos valores
    Math.abs()  //retorna el valor absulto de un número
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClaseMath {

    /*Desarrollar un programa que tome como dato de entrada un número que
     corresponde a la longitud del radio de una esfera y calcular
    y escriba el volumen  de la esfera que se corresponde con dicho radio

    la formula es v= (4/3)*pi*r^3

    */

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del radio de una esfera");
        String entrada = scanner.nextLine();
        entrada = entrada.replace(',', '.');
        double radio = Double.parseDouble(entrada);

        double volumen;

        volumen= (4.0/3.0) * Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de la esfera es: "+ volumen);

        scanner.close();

       /* BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la longitud del radio de una esfera");
        String entrada = lector.readLine();
        entrada = entrada.replace(',', '.');
        double radio = Double.parseDouble(entrada);

        double volumen;

        volumen= (4.0/3.0) * Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de la esfera es: "+ volumen);*/
    }


}
