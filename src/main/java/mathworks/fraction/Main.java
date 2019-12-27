package mathworks.fraction;

import mathworks.fraction.model.Fraction;
import mathworks.fraction.resources.Constants;
import mathworks.fraction.strategy.Calculator;

public class Main {

	/**
	 * A main method to run examples.
	 * 
	 * @param args not used
	 */
	public static void main(String args[]) {

		// our first operation.
		Fraction fraction1 = new Fraction(1, 4);
		Fraction fraction2 = new Fraction(1, 2);
		Fraction result = new Fraction();
		Calculator calc = new Calculator();
		result = calc.addition(fraction1, fraction2);
		calc.display(result, Constants.ADDITION);
	}

}
