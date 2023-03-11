  import java.util.Scanner;
  
    public class BMI3{
    
      public static void main(String[] args){
      
       Scanner userInput = new Scanner(System.in);
       
       System.out.println("Enter the weight in pounds: ");
       
          double weight = userInput.nextDouble();
          
         System.out.println(" Enter the height in inches: ");
         
         double height = userInput.nextDouble();
         
         double pounds =weight * 0.45359237;
         double inches = height * 0.0254;
         
          System.out.printf("BMI is %.4f/n", pounds/(inches*inches));
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }
      
      }
