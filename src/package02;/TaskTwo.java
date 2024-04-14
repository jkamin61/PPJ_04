import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = scan.nextDouble();
        double x = 0;
        if (a >= 0) x = 1.701;
        if (a < 0) x = 2D*3.14f;
        System.out.println(x);
    }
}
