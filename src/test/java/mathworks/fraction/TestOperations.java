package mathworks.fraction;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mathworks.fraction.model.Fraction;
import mathworks.fraction.resources.Constants;

// Write some Unit tests for your program like the following.

public class TestOperations {

	@Test
	public void testAddition() {

		Double result;
		Fraction fraction = new Fraction();
		result = fraction.addition(0.5, 0.25);
		fraction.display(result, Constants.ADDITION);
		//Checking addition result			
		assertTrue(result == 0.75);
	}
	
	@Test
	public void testSubstraction() {

		Double result;
		Fraction fraction = new Fraction();
		result = fraction.substraction(0.5, 0.25);
		fraction.display(result, Constants.SUBSTRACTION);
		//Checking addition result			
		assertTrue(result == 0.25);
	}
	
	@Test
	public void testMultiplication() {

		Double result;
		Fraction fraction = new Fraction();
		result = fraction.multiplication(0.5, 0.25);
		fraction.display(result, Constants.MULTIPLICATION);
		//Checking addition result			
		assertTrue(result == 0.125);
	}
	
	@Test
	public void testDivision() {

		Double result;
		Fraction fraction = new Fraction();
		result = fraction.division(0.5, 0.25);
		fraction.display(result, Constants.MULTIPLICATION);
		//Checking addition result			
		assertTrue(result == 2);
	}
	
	@Test
	public void testEquality() {

		Fraction fraction = new Fraction();
		//Checking addition result			
		assertTrue(fraction.equality(0.5, 0.5));
		assertFalse(fraction.equality(0.5, 0.15));
	}
	
	@Test
	public void testComparisor() {

		Fraction fraction = new Fraction();
		//Checking addition result			
		assertTrue(fraction.comparisor(0.5, 0.4)); //Greater Than
		assertFalse(fraction.equality(0.15, 0.25)); // Less Than
	}
}
