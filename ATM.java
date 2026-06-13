import java.util.*;
class ATMPinChecker{

private int pin = 1234;
private int pinEntered;


public void enterPin(){

int attempts = 3;
Scanner sc = new Scanner(System.in);

while(attempts > 0){
	
	System.out.println("Please Enter The PIN");
    int pinEntered = sc.nextInt(); 
	
	
   if(pinEntered == pin){
   System.out.println("Login Successful\n Welcome to ATM Services");
   break;
   }
   
   else if(attempts == 0){
   System.out.println("Invalid PIN\n Card Blocked,Please Contact the Bank");
   }
   
   else{
   System.out.println("Invalid PIN");
   attempts--;
   System.out.println("Attempts remaining:-"+ attempts);
   }
   
   
   
 }
}
}


public class ATM{
  
  
  public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 
 ATMPinChecker a1 = new ATMPinChecker();
 a1.enterPin();
  
  
  
 }
}