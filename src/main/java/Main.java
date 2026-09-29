import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        //Input
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Logic and Output
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
