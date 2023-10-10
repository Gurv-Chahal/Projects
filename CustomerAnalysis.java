// Program does a customer analysis by asking for the number of departments you want to calculate from, the number of customers that shopped in each
// department, the total money spent in each department, the satisfaction out of 5 the customers typically reported, then a likelihood to shop again
// metric is obtained from that information 

import java.util.*;

public class Customer_Analysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // build scanner

        System.out.print("Enter the number of departments: ");
        int numDepartments = scanner.nextInt(); // take integer input from user and store in numDepartments

        // intialize variable 
        int totalCustomers = 0;
        double totalMoneySpent = 0;
        double totalSatisfaction = 0;

        // keep iterating well i <= userinput 
        for (int i = 1; i <= numDepartments; i++) {

            System.out.println("Department " + i + ":");
            System.out.print("Number of customers: ");
            int numCustomers = scanner.nextInt(); //take integer input from user and store it in numCustomers

            System.out.print("Total money spent: $");
            double moneySpent = scanner.nextDouble(); //take double input from user and store it in moneySpent

            System.out.print("Satisfaction out of 5: ");
            double satisfaction = scanner.nextDouble(); // take double input from user and store it in satisfaction

            // before the next iteration add and assign these variables 
            totalCustomers += numCustomers; 
            totalMoneySpent += moneySpent;
            totalSatisfaction += (satisfaction * numCustomers);

            System.out.println();
        }

        System.out.println(); // creates a space in the output for readability

        double averageSatisfaction = totalSatisfaction / totalCustomers;

        System.out.println("Total Customers: " + totalCustomers);
        //using printf in the statements below to format the output to 2 decimal places
        System.out.printf("Total Money Spent: $ %.2f \n", totalMoneySpent); 
        System.out.printf("Average Satisfaction: %.2f \n", averageSatisfaction);

        // Calculate likelihood of shop again formula
        double likelihoodToShopAgain = (averageSatisfaction / 5) * (totalMoneySpent / totalCustomers);

        System.out.printf("Likelihood to Shop Again: %.2f \n", likelihoodToShopAgain);
    }
}
