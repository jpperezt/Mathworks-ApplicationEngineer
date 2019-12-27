package mathworks.fraction;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mathworks.fraction.model.Fraction;
import mathworks.fraction.resources.Constants;
import mathworks.fraction.strategy.Calculator;

// Write some Unit tests for your program like the following.

public class TestOperations {

	@Test
	public void testAddition() {

		Fraction fraction1 = new Fraction(1, 4);
		Fraction fraction2 = new Fraction(1, 2);
		Fraction result = new Fraction();
		Calculator calc = new Calculator();
		result = calc.addition(fraction1, fraction2);
		calc.display(result, Constants.ADDITION);
		// Checking Addition result
		assertTrue(result.toString().equals("3/4"));
	}

	@Test
	public void testSubstraction() {

		Fraction fraction1 = new Fraction(7, 4);
		Fraction fraction2 = new Fraction(1, 2);
		Fraction result = new Fraction();
		Calculator calc = new Calculator();
		result = calc.subtraction(fraction1, fraction2);
		calc.display(result, Constants.SUBSTRACTION);
		// Checking Subtraction result
		assertTrue(result.toString().equals("5/4"));
	}

	@Test
	public void testMultiplication() {

		Fraction fraction1 = new Fraction(3, 4);
		Fraction fraction2 = new Fraction(1, 2);
		Fraction result = new Fraction();
		Calculator calc = new Calculator();
		result = calc.multiplication(fraction1, fraction2);
		calc.display(result, Constants.MULTIPLICATION);
		// Checking Multiplication result
		assertTrue(result.toString().equals("3/8"));
	}

	@Test
	public void testDivision() {

		Fraction fraction1 = new Fraction(3, 4);
		Fraction fraction2 = new Fraction(1, 2);
		Fraction result = new Fraction();
		Calculator calc = new Calculator();
		result = calc.division(fraction1, fraction2);
		calc.display(result, Constants.DIVISION);
		// Checking Division result
		assertTrue(result.toString().equals("3/2"));
	}

	@Test
	public void testEquality() {

		Fraction fraction1 = new Fraction(3, 4);
		Fraction fraction2 = new Fraction(3, 4);
		Fraction fraction3 = new Fraction(1, 4);
		// Fraction result = new Fraction();
		Calculator calc = new Calculator();
		// Checking Equality result
		assertTrue(calc.equality(fraction1, fraction2));
		System.out.println(fraction1 + " is equal to " + fraction2);
		assertFalse(calc.equality(fraction1, fraction3));
		System.out.println(fraction1 + " is not equal to " + fraction3);
	}

	@Test
	public void testComparisor() {

		Fraction fraction1 = new Fraction(3, 4);
		Fraction fraction2 = new Fraction(1, 4);
		Fraction fraction3 = new Fraction(5, 4);
		// Fraction result = new Fraction();
		Calculator calc = new Calculator();
		// Checking comparisor result
		assertTrue(calc.comparison(fraction1, fraction2));
		assertFalse(calc.comparison(fraction1, fraction3));
	}
}
