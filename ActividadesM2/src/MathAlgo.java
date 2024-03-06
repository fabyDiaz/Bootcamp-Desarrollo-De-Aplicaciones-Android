import java.util.Scanner;

public class MathAlgo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(Math.sqrt(n));
        System.out.println(Math.pow(n,7));
    }
}
