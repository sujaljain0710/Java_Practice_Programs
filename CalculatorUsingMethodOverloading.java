import java.util.*;
class Calculator{



    public int calculate(int a,int b){
	return a+b;
	}
	
    public int calculate(int a,int b,int c){
	return a+b+c;
	}
  
    public double calculate(double a,double b){
	return a+b;
	}
	
	public long calculate(long a,long b){
	return a*b;
	}
	
	}
	
	public class CalculatorUsingMethodOverloading {
	
	public static void main(String[] args){
	
	  Calculator c1 = new Calculator();
	  
	 
	 System.out.println("The sum of 2 integers is "+ c1.calculate(3,4) );
	 
	 System.out.println("The sum of 3 integers is "+  c1.calculate(5,6,7) );
	 
	 System.out.println("The addition of 2 decimal numbers is "+ c1.calculate(79.443,87.34 ));
	 
	 System.out.println("The multiplication of 2 numbers is "+ c1.calculate(457l,7389l));
	 
	 
	 
	 
	
	

	
	  }
	}
	
