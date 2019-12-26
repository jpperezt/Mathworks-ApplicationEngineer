package mathworks.fraction;

import mathworks.fraction.model.Fraction;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
	 public static void main(String args[]) {
		    
		 	Double result;
		    // our first operation. 
		    Fraction fraction = new Fraction();
		    result = fraction.addition(0.5, 0.25);
		    fraction.display(result, "addition");
	 }

}
