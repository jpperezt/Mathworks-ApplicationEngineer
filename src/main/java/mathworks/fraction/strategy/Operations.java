package mathworks.fraction.strategy;

public interface Operations {
  // this interface represents all different operations with the fractions.

  public Double addition(Double n1, Double n2);
  
  public Double substraction(Double n1, Double n2);
  
  public Double multiplication(Double n1, Double n2);
  
  public Double division(Double n1, Double n2);
  
  public Boolean equality(Double n1, Double n2);
  
  public Boolean comparisor(Double n1, Double n2);
  
  public String display(Double result, String operation);
  
}
