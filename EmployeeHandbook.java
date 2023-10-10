// basic program that just goes through some fundamental aspects of working in a workplace, specifically Home Depot

import java.util.*;

public class Employee_Handbook {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    int input = 0; 

    while (input != -1) { 
      System.out.println("Choose a category you want to know more about: ");
      System.out.println("1. GET (Greet, Engage, Thank)");
      System.out.println("2. Workplace Communication");
      System.out.println("3. Learning New Skills");
      System.out.println("4. Workplace Atmosphere");
      System.out.println("-1. Exit"); 

      input = console.nextInt(); 

      System.out.println();

      if (input == 1) {
        System.out.println("Greet, Engage, Thank are important to implement in the workplace because it effectively helps customers find what they need,\n as well as making them have a great experience. This leads to customers consistently coming back \n");
      } else if (input == 2) {
        System.out.println("To effectively communicate in the workplace, coordinate with your coworkers to make sure breaks are properly taken,\n customers are properly helped, and the store is run cohesively\n");
      } else if (input == 3) {
        System.out.println("Being able to learn new skills is important, for example another department or reach truck. \nThe best way to do this is to tell your department supervisor who can help give you the resources you need to learn and point you in the right direction\n");
      } else if (input == 4) {
        System.out.println("Maintaining a healthy workplace environment is important. This can be done by communicating any questions you have with managers or coworkers.\n Also by creating a friendly environment that is free of judgment and is inclusive\n");
      } else if (input == -1) {
        System.out.println("Exiting the Employee Handbook. Goodbye!");
      } else {
        System.out.println("Invalid input. Please choose a valid option.");
      }
    }
  }
}
