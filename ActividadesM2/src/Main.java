import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); //.locale(locale.US);
            double nota1Alumno = 0;
            double nota2Alumno = 0;
            double nota3Alumno = 0;
            double promedioAlumno = 0;

            System.out.println("Ingrese la nota 1: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Intente nuevamente (ingrese la nota con coma): ");
                scanner.next(); // Limpiar el buffer de entrada
            }
            nota1Alumno = scanner.nextDouble();

            System.out.println("Ingrese la nota 2: ");
            nota2Alumno = scanner.nextDouble();

            System.out.println("Ingrese la nota 3: ");
            nota3Alumno = scanner.nextDouble();



            promedioAlumno = (nota1Alumno +  nota2Alumno + nota3Alumno) / 3;

            System.out.println("El promedio del alumno es: " + promedioAlumno );

            scanner.close();

        }


}