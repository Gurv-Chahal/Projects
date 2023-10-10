// this program calculates employee hours, it simulates yearly profit for the last 5 years by generating a random number between 40 and 60 million
// for each year. Then it compares it to the current profit which is set to 48 million and gives a percentage trend. Then that percentage is used
// to calculate hours given to each store in the department. Each department is given 16 hours then it will +- hours based on percentage

import java.util.*;

public class Employee_Scheduling {
  public static void main(String[] args) {

   double projectedProfit = ProjectedProfit(); // Get the projected profit value

   double profitTrend = ProfitTrend(projectedProfit); // Pass the projected profit to ActualProfit method

  }

  public static double ProjectedProfit() {
    // This method gets the average profit for the last 5 years, it simulates this by 
    // creating a random object and giving a random number for each year between 40 and 60 million

    Random rand = new Random(); // create a random object
    double start = 40000000; // 40,000,000
    double sum = 0; // Initialize sum to zero

    System.out.println("\nProfit Last 5 Years: \n");

    for (int year = 2018; year <= 2022; year++) {
      double number = rand.nextDouble() * 20000000 + start; // Generate a new random number for each year between 40 - 60 million
      System.out.printf("Year %d: %.2f%n", year, number); // Format the output to display only two decimal places
      sum += number;
    }

    System.out.println();

    double average = (sum / 5);
    System.out.println("Average profit of last 5 years: ");
    System.out.printf("Average is: %.2f%n", average); // Format the average output
    System.out.println();
    return average;
  }

  
  
  public static double ProfitTrend(double projectedProfit) {
    // This calculates profit trend as a percentage 
    int currentProfit = 48000000; // 48,000,000

    double percentage = ((double)projectedProfit / (double)currentProfit);

    if (currentProfit > projectedProfit) {
    System.out.printf("Current profit trend is %.2f%%", percentage);
    } else {
       System.out.printf("Current profit trend is  -%.2f%%", percentage);
    }

    // This calculate how many extra or fewer hours are given to each department in the store
    // We set StandardHours to 16 since that's a baseline of the daily hours given to a single department
    double StandardHours = 16;
    double Hours = 0;

    if (currentProfit < projectedProfit) {
    Hours = (StandardHours * (percentage / -100)) + 16; 
    }
    else {
      Hours = (StandardHours * (percentage / 100)) + 16;
    }

    System.out.println();

    System.out.printf("\nCalculated hours are %.2f", Hours);
    
    return percentage;
  }


}


