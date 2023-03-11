import java.util.Scanner;

 public class Kilogram4{
 
 public static void main(String[] args) {
 
 Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter a number of kilogram: ");
  
   double pounds = userInput.nextDouble();
   
   double pound = 0.454;
   
   double result= pounds * pound;
  
   
    System.out.println(pounds + " pounds is " + result + "kilograms");
 
 
 }
 }
