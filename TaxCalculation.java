//index number 18020569

package taxCalc;

import calculator.*;

public class TaxCalculation{

	public static void main(String args[]){
		calculator.SimpleCalculator interestAmount = new calculator.SimpleCalculator();
		double finalOutput = interestAmount.intrestCalculation(20000.0,8.0);
		System.out.println("Interest rate to be paid "+ finalOutput);
	}
}


