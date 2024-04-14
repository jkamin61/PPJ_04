package package06;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        whatSeason();
    }

    public static void whatSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month: ");
        int m = scanner.nextInt();
        System.out.println("Please enter day: ");
        int d = scanner.nextInt();

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid input");
        }
        switch (m) {
            case 1, 2, 3:
                if (d < 20) {
                    System.out.println("Winter");
                } else {
                    System.out.println("Spring");
                }
                break;
            case 4:
                if (d < 20) {
                    System.out.println("Spring");
                } else {
                    System.out.println("Summer");
                }
                break;
            case 5, 6:
                if (d < 21) {
                    System.out.println("Spring");
                } else {
                    System.out.println("Summer");
                }
                break;
            case 7, 8, 9:
                if (d < 23) {
                    System.out.println("Summer");
                } else {
                    System.out.println("Fall");
                }
                break;
            case 10:
                if (d < 23) {
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
                break;
            case 11:
                if (d < 22) {
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
                break;
            case 12:
                if (d < 21) {
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
                break;
        }
    }
}
