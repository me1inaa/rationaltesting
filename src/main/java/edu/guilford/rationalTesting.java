package edu.guilford;


public class rationalTesting 
{
    public static void main( String[] args )
    {
    
    //instantiating the constructor with no arguments
    Rational r1 = new Rational();
    //testing the constructor and the toString method 
    System.out.println("Testing the constructor with no arguments toString: ");
    System.out.println("Rational number r1 is: " + r1.toString());

    //instantiating the constructor with two arguments
    Rational r2 = new Rational(1, 2);
    //testing the constructor and the toString method
    System.out.println("\nTesting the constructor with two arguments toString: ");
    System.out.println("Rational number r2 is: " + r2.toString());

    //testing the negate method with the second constructor and printing it out
    System.out.println("\nTesting the negate method: ");
    System.out.println("Input: 1/2 (r2)" + "\t\tExpected Output: -1/2");
    r2.negate();
    System.out.println("Negating 1/2 (r2): " + r2.toString());

    //testing the invert method with the second constructor and printing it out
    System.out.println("\nTesting the invert method: ");
    System.out.println("Input: -1/2 (r2 negated)" + "\tExpected Output: -2/1");
    r2.invert();
    System.out.println("Inverting -1/2 (r2 negated): " + r2.toString());

    //testing the toDouble method with the second constructor and printing it out
    System.out.println("\nTesting the toDouble method: ");
    System.out.println("Input: -2/1 (r2 inverted)" + "\tExpected Output: -2.0");
    System.out.println("Converting -2/1 (r2 inverted) to a double: " + r2.toDouble());

    //instantiate a new rational object
    System.out.println("\nTesting the reduction of a rational number: ");
    Rational r3 = new Rational(36, 22);
    //print out r3 using the reduce method
    System.out.println("Input: 36/22" + "\tExpected Output: 18/11");
    System.out.println("Reducing 36 / 22 (r3): " + r3.reduce());
    //store the reduced r3 as a new rational object, r4
    Rational r4 = r3.reduce();

    //print out the sum of r1 and r4
    System.out.println("\nTesting the addition of rational numbers:");
    Rational r5 = r1.add(r4).reduce();
    System.out.println("Input: r1 = 0/1, r4 = 18/11" + "\nExpected Output: N/A since r1 is randomly generated");
    System.out.println("The sum of r1 and r4 is: " + r5.toString());

    // instantiate a new rational number with 0 as denominator 
    // Rational r5 = new Rational(1, 0);
    // print out r5
    // System.out.println("Rational number r5 is: " + r5.toString());

    }
  
}
