import java.util.Scanner;

 public class Years8{
 
 
 public static void main(String[] args) {
 
 int year, minute, day;
 
 Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter the number of minute: ");
  
    minute = userInput.nextInt();
   
    year = minute/525600; //525600= 365*24*60
    
    year = (int)year;
    
    day = (minute - year*525600)/(24*60);
    
    day = (int)day;
    
    
   
        System.out.println(minute + " minute is approximately "+ year +" years "+" and " + day +" days");
 
 }
 } 
