//index number 18020569

package calcPackage;

import java.util.Scanner;
import arithmeticCalculator.*;

public class Calculation{
	 public static void main(String args[]){

	//user input
		Scanner input=new Scanner(System.in);
	        System.out.print("Enter first number : ");
        	double n1=input.nextDouble();
	        System.out.print("Enter second number : ");
        	double n2=input.nextDouble();
		System.out.println("");

		arithmeticCalculator.SimpleArithmeticCalculator value = new arithmeticCalculator.SimpleArithmeticCalculator();
		
		System.out.println("Addition = "+ value.add(n1,n2));

		System.out.println("Subtraction = "+ value.subtract(n1,n2));

		System.out.println("Division = "+ value.division(n1,n2));

		System.out.println("Multiplication = "+ value.multiplication(n1,n2));

	}
}


