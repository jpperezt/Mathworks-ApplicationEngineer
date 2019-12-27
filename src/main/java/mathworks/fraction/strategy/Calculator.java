package mathworks.fraction.strategy;

import java.util.InputMismatchException;

import mathworks.fraction.model.Fraction;

public class Calculator implements Operations {

	/**
	 * Constructor method.
	 */
	public Calculator() {
		super();
	}

	/**
	 * Method to execute the Addition Operation.
	 */
	@Override
	public Fraction addition(Fraction f1, Fraction f2) {
		Fraction result = new Fraction(
				((f1.getNumerator() * f2.getDenominator()) + (f2.getNumerator() * f1.getDenominator())),
				(f1.getDenominator() * f2.getDenominator()));
		result = toLowestTerms(result);
		return result;
	}

	/**
	 * Method to execute the Subtraction Operation.
	 */
	@Override
	public Fraction subtraction(Fraction f1, Fraction f2) {

		Fraction result = new Fraction(
				((f1.getNumerator() * f2.getDenominator()) - (f2.getNumerator() * f1.getDenominator())),
				(f1.getDenominator() * f2.getDenominator()));
		result = toLowestTerms(result);
		return result;

	}

	/**
	 * Method to execute the Multiplication Operation.
	 */
	@Override
	public Fraction multiplication(Fraction f1, Fraction f2) {
		Fraction result = new Fraction((f1.getNumerator() * f2.getNumerator()),
				(f1.getDenominator() * f2.getDenominator()));
		result = toLowestTerms(result);
		return result;
	}

	/**
	 * Method to execute the Division Operation.
	 */
	@Override
	public Fraction division(Fraction f1, Fraction f2) {
		if (f2.getNumerator() == 0) {
			throw new IllegalArgumentException();
		} else {
			Fraction result = new Fraction((f1.getNumerator() * f2.getDenominator()),
					(f1.getDenominator() * f2.getNumerator()));
			result = toLowestTerms(result);
			return result;
		}
	}

	/**
	 * Method to execute the Equality Operation.
	 */
	@Override
	public Boolean equality(Fraction f1, Fraction f2) {
		if (f2 instanceof Fraction) {
			f2 = toLowestTerms(f2);
			f1 = toLowestTerms(f1);
			return (f1.getNumerator() == f2.getNumerator()) && (f1.getDenominator() == f2.getDenominator());
		} else {// if object not Fraction
			throw new InputMismatchException("Fraction expected.");
		}
	}

	/**
	 * Method to execute the Comparison (Greater Than/Less Than) Operation.
	 */
	@Override
	public Boolean comparison(Fraction f1, Fraction f2) {
		if (f1.toDouble() > f2.toDouble()) {
			System.out.println(f1 + " Is Greater Than " + f2);
			return true;
		} else if (f1.toDouble() < f2.toDouble()) {
			System.out.println(f1 + " Is Less Than " + f2);
			return false;
		}
		return false;
	}

	/**
	 * Method to display the Results.
	 */
	@Override
	public String display(Fraction result, String operation) {
		String message = null;
		message = "The result of the " + operation + " operation, is: " + result;
		System.out.println(message);
		return message;
	}

	/**
	 * Converts the current fraction to the lowest terms.
	 * 
	 * @param fraction object.
	 * @return fraction
	 */
	private Fraction toLowestTerms(Fraction fraction) {
		int gcd = gcd(fraction.getNumerator(), fraction.getDenominator());
		int numerator = 1;
		int denominator = 1;
		Fraction result = new Fraction(numerator, denominator);
		result.setNumerator(fraction.getNumerator() / gcd);
		result.setDenominator(fraction.getDenominator() / gcd);
		return result;
	}

	/**
	 * Takes in two ints and determines the greatest common divisor of the two ints.
	 * 
	 * @param num numerator.
	 * @param den denominator.
	 * @return greatest common divisor
	 */
	private static int gcd(int num, int den) {
		while (num != 0 && den != 0) {
			int remainder = num % den;
			num = den;
			den = remainder;
		}
		return num;
	}
}
