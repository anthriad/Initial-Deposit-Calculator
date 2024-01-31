// Anthony Riad
// 1/31/2024

import java.util.Scanner;

public class InitialDepositAmtCalc {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
     
    // Prompt user to input final account value
    System.out.print("Enter Final Account Value: ");
    double finalAccountValue = input.nextDouble();

    //Prompt user to input annual interest rate in percentage
    System.out.print("Enter Annual Interest Rate Percentage:");
    double annualInterestRate = input.nextDouble();

    //Prompt user to input number of years
    System.out.print("Enter number of years: ");
    double years = input.nextDouble();

    //Close the input
    input.close();
    
    //Calculate initial deposit
   double initialDeposit = finalAccountValue / Math.pow(1 + annualInterestRate / 100,years);

    //Print initial deposit
    System.out.println("Initial deposit value is :" + initialDeposit);
  }
}
