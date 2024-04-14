package package07;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);

        int intValue = scanner.nextInt();
        if (intValue >= 0) {
            System.out.println("A set");
        }
        if (intValue <= 1) {
            System.out.println("B set");
        }
        if (intValue >= 0 && intValue <= 1) {
            System.out.println("C set");
        }
    }
}
