import java.util.Scanner;
  
      public class Energy6{
  
        public static void main(String [] args){
  
    Scanner userInput = new Scanner(System.in);
    
      System.out.print("Enter the amount of water in kilograms: ");  
  
     double kilograms = userInput.nextDouble();
  
 System.out.print("Enter the initial temperature: ");   
  
      double initialTemperature = userInput.nextDouble();
      
 System.out.print("Enter the final temperature: ");   
  
      double finalTemperature = userInput.nextDouble();
  
  double result = kilograms * (finalTemperature - initialTemperature) * 4184;
  
   System.out.println("The cost of driving is: " + result);
  
  
  }
  
  }
