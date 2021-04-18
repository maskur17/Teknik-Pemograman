package InputTest;

import java.util.Scanner;

/**
 * This program demonstrates console input.
 *
 * @author Dimas Kurniawan
 * @version 1.10 2004-02-10
 */

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.format("%10s%15s%15s%15s%20s",
                "Grade", "Last Name", "First Name", "Student Number", "Parent Email");

        // display output on console
        System.out.println("Hello, " + name + ", Next year, you'll be " + (age + 1));
    }
}