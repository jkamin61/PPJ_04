package package04;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        int b = 1;
        // !(a < b) && !(a > b) -> a == b
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
    }
}
