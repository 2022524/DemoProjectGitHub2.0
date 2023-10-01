/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoprojectgithub;

import java.util.Scanner;

/**
 *
 * @author tarqu
 */
public class DemoProjectGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
         Scanner MyKB = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a number (or 'q' to quit): ");

            if (MyKB.hasNextInt()) {
                int userInput = MyKB.nextInt();
                System.out.println("You entered: " + userInput);
            } else {
                String input = MyKB.next();
                if (input.equals("q")) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                } else {
                    System.out.println("Error: Invalid input. Please enter a valid integer or 'q' to quit.");
                }
            }
        }
    }
}