import java.io.IOException;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int a;
    double b;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextDouble();
    System.out.printf("%.3f km/l\n", a / b);
     }
    
}
