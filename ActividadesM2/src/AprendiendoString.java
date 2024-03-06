/*.concat()
    .equals()
    .indexOf()
    .subString() //Mostrar el texto a partri del indice
    .length() //devuelve el largo de la cadena de caracteres
    .toUpperCase() //convierte el texto en mayúsculas
    .toLowerCase(); //Convierte el texto en minúsculas
    .chartArt(); //Obtiene el indice
 */

public class AprendiendoString {

    public static void main(String[] args) {
        String a= "Hola Mundo";
        String b = "Mi nombre es ";

        String c = "Fabiola";

        String unir = b.concat(" ").concat(c);
        System.out.println(unir);

        int valorindice= a.indexOf("o"); //devuelve la posición del primer carácter de la subcadena especificada dentro de la cadena actual.
        System.out.println("La posición del caracter es: " + valorindice);




    }

}
