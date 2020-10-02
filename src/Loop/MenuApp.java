package Loop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MenuApp {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
//                    for (int i = 0; i < 6; i++) {
//                        for (int j = 0; j < 6 - i; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
                    IntStream.range(0,6).forEach(i -> {
                        IntStream.range(0, 6 - i).forEach(j -> {
                            System.out.print("* ");
                        });
                        System.out.println();
                    });
                    break;
                case 2:
                    System.out.println("Draw the square");
//                    for (int i = 0; i < 6; i++) {
//                        for (int j = 0; j < 6; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
                    IntStream.range(0,6).forEach(i -> {
                        IntStream.range(0, 6).forEach(j -> {
                            System.out.print("* ");
                        });
                        System.out.println();
                    });
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
//                    for (int i = 0; i < 3; i++) {
//                        for (int j = 0; j < 6; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
                    IntStream.range(0,3).forEach(i -> {
                        IntStream.range(0, 6).forEach(j -> {
                            System.out.print("* ");
                        });
                        System.out.println();
                    });
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }
}
