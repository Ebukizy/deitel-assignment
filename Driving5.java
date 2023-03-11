  import java.util.Scanner;
  
      public class Driving5{
  
        public static void main(String [] args){
  
    Scanner userInput = new Scanner(System.in);
    
      System.out.print("Enter the driving distance: ");  
  
     double fuel = userInput.nextDouble();
  
 System.out.print("Enter miles per gallon: ");   
  
      double miles = userInput.nextDouble();
      
 System.out.print("Enter price per gallon: ");   
  
      double price = userInput.nextDouble();
  
  double result = fuel * price / miles;
  
  System.out.printf("Them cost of driving is: %2f\n", + result);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
  
  
  }
