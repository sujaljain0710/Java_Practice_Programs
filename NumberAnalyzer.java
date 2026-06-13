
import java.util.*;
public class NumberAnalyzer{

   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Please enter the number");
   int number = sc.nextInt();
   
   
   if(number == 0){
   System.out.println("Number is Zero");
   
   }
   else if(number > 0){
     System.out.println("Number is a positive integer");
   
   }
   
   else {
     System.out.println("Number is a negative integer");
   }
   
   String result;
   
   result = number % 2 == 0?"Even number":"Odd number";
   
   System.out.println("Given number is a "+ result);
   
   
   }

}