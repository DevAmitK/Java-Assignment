package Question_03;

import java.util.Scanner;

public class FindBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    numbers[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next();
                }
            }
        }

        int largest = numbers[0];
        for (int i = 1; i < 4; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The biggest number is: " + largest);
        sc.close();
    }
}
