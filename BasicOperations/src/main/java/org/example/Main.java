package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit a number: ");
        double n1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digit a second number: ");
        double n2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("what operation do you want to do? ");
        String operation = sc.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", n1, n2, n1+n2);
        }
        else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", n1, n2, n1-n2);
        }
        else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", n1, n2, n1*n2);
        }
        else if (operation.equals("div")) {
            if (n2 == 0) {
                System.out.println("You can not divide by zero!");
            } else {
                System.out.printf("%f /  %f = %f", n1, n2, n1 / n2);
            }
        }
        else {
            System.out.printf("%s this operation is not allowed", operation);
        }
        sc.close();
    }
}