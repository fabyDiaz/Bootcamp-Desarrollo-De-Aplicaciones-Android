public class tareaSinCadenas {

    public static void main(String[] args) {

        String texto1 = "programando en java";
        String cuartaQuintaLetra = texto1.substring(3,5);

        System.out.println("La cuarta y quenta  letra del texto es: "+cuartaQuintaLetra);

        texto1 = texto1.toLowerCase();
        int contador =0;

        for (int i = 0; i < texto1.length(); i++) {
            char letra = texto1.charAt(i);

            // Verifica si el carácter es una vocal
            if (letra == 'a' ||  letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("la cantidad de vocales es "+ contador);
    }
}
