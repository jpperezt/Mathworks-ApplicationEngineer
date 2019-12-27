package mathworks.fraction.model;

/**
 * Fraction is an object that holds information about a fraction (numerator and
 * denominator)
 * 
 * @author Perez Torres Jose
 *
 */
public class Fraction {

	private int numerator;
	private int denominator;

	/**
	 * Two parameter constructor that initializes the numerator and denominator.
	 * 
	 * @param num numerator
	 * @param den denominator
	 */
	public Fraction(int num, int den) {
		if (den == 0) {// throw an IllegalArgumentException if the denominator is zero
			throw new IllegalArgumentException("not possible to use denominator zero");
		} else if (den < 0) {// If the user enters a negative denominator bump the negative sign to the
								// numerator.
			// For example, -3/-2 should be converted to 3/2. Likewise, 5/-3 should be
			// converted to -5/3
			this.numerator = num * -1;
			this.denominator = den * -1;
		} else {
			this.numerator = num;
			this.denominator = den;
		}
	}

	/**
	 * One parameter constructor that initializes the object equal in value to the
	 * integer parameter
	 * 
	 * @param num numerator
	 */
	public Fraction(int num) {
		this(num, 1);
	}

	/**
	 * Zero parameter constructor that initializes the object to 0, meaning the
	 * numerator is 0 and the denominator is 1.
	 */
	public Fraction() {
		this(0);
	}

	/**
	 * Getter Numerator.
	 * 
	 * @return
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Getter Denominator.
	 * 
	 * @return
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Setter Numerator.
	 * 
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * Setter Denominator.
	 * 
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	/**
	 * toString Method.
	 */
	public String toString() { // "numerator/denominator", a String representation of the Fraction
		return numerator + "/" + denominator;
	}

	/**
	 * toDouble method.
	 * 
	 * @return
	 */
	public double toDouble() { // the result of numerator / denominator
		// System.out.println(this.numerator + " " + this.denominator);
		double result = Double.valueOf(this.numerator) / Double.valueOf(this.denominator);
		// System.out.println(result);
		return result;
	}

}
