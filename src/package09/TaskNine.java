package package09;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wrt = scanner.nextInt();
        if ((wrt > -15 && wrt < -10) || (wrt < -13)) {
            System.out.println("Number is in both sets A and B");
        }
        if (wrt > -15 && wrt < -10) {
            System.out.println("Number is in set A");
        }
        if (wrt < -13) {
            System.out.println("Number is in set B");
        }
    }
}
