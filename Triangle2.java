  import java.util.Scanner;
  
    public class Triangle2{
    
    public static void main(String[] args){
    
     Scanner userInput = new Scanner(System.in);
     
       System.out.print("Enter side 1: ");
       
     float side1= userInput.nextFloat();
       
       System.out.print("Enter side 2: ");
       
        float side2 =   userInput.nextFloat();
        
       System.out.print("Enter side 3: ");
           
     float  side3 =  userInput.nextFLoat();
          
          float s = (float) (side1 + side2 + side3)/2;
          
          double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
          
          System.out.println("The area of a trianle " + area);
          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
  }
