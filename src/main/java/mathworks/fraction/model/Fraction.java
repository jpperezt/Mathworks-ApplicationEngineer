package mathworks.fraction.model;

import mathworks.fraction.strategy.Operations;

public class Fraction implements Operations {

	@Override
	public Double addition(Double n1, Double n2) {
		Double result;
		result = n1 + n2;
		return result;
	}

	@Override
	public Double substraction(Double n1, Double n2) {
		Double result;
		result = n1 - n2;
		return result;
	}

	@Override
	public Double multiplication(Double n1, Double n2) {
		Double result;
		result = n1 * n2;
		return result;
	}

	@Override
	public Double division(Double n1, Double n2) {
		Double result = null;
		try {
			result = n1 / n2;
		}
		catch(Exception e) {
			System.out.println("Operation invalid " + e.getMessage());
		}
		return result;		
	}

	@Override
	public Boolean equality(Double n1, Double n2) {
		return n1.equals(n2);
	}

	@Override
	public Boolean comparisor(Double n1, Double n2) {
		if (n1 > n2) {
			return true;  // Greater Than
		}		
		return false; // Less Than
	}

	@Override
	public String display(Double result, String operation) {
		String message = "The result of the " + operation + " operation, is:  " + result;
		System.out.println(message);
		return message;
	}

	
}
