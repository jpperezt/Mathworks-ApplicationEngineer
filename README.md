
# Fraction Project - MathWorks - Software Application Engineer - By Jose Perez Torres

This is a Java Maven Project corresponding to the **Fraction Project** during the application process for Software Application Engineer position in MathWorks.

# Implementation Description

-   This application is based on the description requested by MathWorks for handling the following operations with Fractions:
	> Addition, Subtraction, Multiplication, and Division
	> Equality/non-equality
	> Greater than/less than
	> Display.
    
- This application was designed thinking in modularity, extensibility and reusability i.e.:	
	- Operations interface allows to add more operations in the future or if I want to add operation with other type of numbers.
	
	- Calculator class contains two methods highly reused in the application, **gcd** to get the greatest common divisor of two integers and **toLowestTerms** to convert the fraction to the lowest terms.
	- Fraction class only is the model class to contain the constructors, numerator, denominator and respective getters and setters, it allows modularity.plementation is **Sufficiency** because is getting the requirements for this assignment.
    
    > Controls the notiﬁcation system to send notiﬁcations about delivery requests to drivers. When a store gets a product delivery orders should be created at store and a delivery request should be broadcasted to all drivers.


# Assumptions
All the testing is based in JUnits, so, I am not implementing any user interface.
  
  
# Things to Improve

-   We can handling more flexibility and modularity applying Strategy Design Pattern for the different operations, so, different behaviors depending of the Operation Type at least for the Display Operation.
