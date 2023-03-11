  import java.util.Scanner;
  
  public class Velocity1{
  
     public static void main(String[] args){
   
     
     Scanner userInput = new Scanner(System.in);
     
       System.out.print("Enter the Starting Velocity: ");
       
        double v0 = userInput.nextDouble();
        
     System.out.print("Enter the Ending Velocity: ");
     
      double v1 = userInput.nextDouble();      

          System.out.print("Enter the Time Span: ");
      
          double t = userInput.nextDouble();  
          
          double result = (v1 - v0) / t;
          
                   
            
           System.out.println("The average acceleration is " +  result);
            
            
     
     
       
     
     
     
     
     
     
     
     
    
     
     }
     
     }
