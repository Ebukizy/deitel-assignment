import java.util.Scanner;

 public class Meters7{
 
 public static void main(String[] args) {
 
 Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter a value for feet: ");
  
   double meters = userInput.nextDouble();
   
   double foot_per_meter = 0.305;
   
   double result = meters * foot_per_meter;
   
    System.out.println(meters + " feet is " + result + "meters");
 
 
 }
 }
