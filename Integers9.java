import java.util.Scanner; 

 public class Integers9{
 
 
 public static void main(String[] args) {
 
 int num, integer, odd = 0, even = 0; //declare variables
 
 Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter the number of integers: ");
  
    num = userInput.nextInt();
    
    System.out.print("Enter the integers:\n"); // prompts user to enter number of 
    
    for (int i = 0; i <num; i++) {
    
    integer = userInput.nextInt();
    
    if (integer % 2 == 0)

       even += integer;
       
       else // if integer value is not completely disvisble by 2
     
     odd +=integer;}  
       
       
       System.out.print("Sum of Even Numbers: " + even);
       
       System.out.print("\nSum of Odd Numbers: " + odd);
     
   
     
     
    }
    
    }
    
