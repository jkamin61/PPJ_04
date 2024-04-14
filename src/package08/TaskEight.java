package package08;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wrt = scanner.nextInt();
        if ((wrt > -15 && wrt <= -10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10)) {
            System.out.println("A set");
        }
        if ((wrt <= -13) || (wrt > -8 && wrt <= -3)) {
            System.out.println("B set");
        }
        if (wrt >= -4) {
            System.out.println("C set");
        }
    }
}
