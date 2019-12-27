package mathworks.fraction.strategy;

import mathworks.fraction.model.Fraction;

public interface Operations {
  // this interface represents all different operations with the fractions.

  public Fraction addition(Fraction f1, Fraction f2);
  
  public Fraction subtraction(Fraction f1, Fraction f2);
  
  public Fraction multiplication(Fraction f1, Fraction f2);
  
  public Fraction division(Fraction f1, Fraction f2);
  
  public Boolean equality(Fraction f1, Fraction f2);
  
  public Boolean comparison(Fraction f1, Fraction f2);
  
  public String display(Fraction f1, String operation);
  
}
