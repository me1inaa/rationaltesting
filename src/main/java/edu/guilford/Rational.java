package edu.guilford;
import java.util.Random;
public class Rational {

    private int numerator;
    private int denominator;

    //constructor with no arguments setting numerator as 0 and demoninator as 1
    //changed to generate random numbers between -100 and 100
    public Rational() {
        Random randGen = new Random();
        this.numerator = randGen.nextInt(-100,100) + 1;
        this.denominator = randGen.nextInt( -100,100) + 1;
        while (denominator == 0) {
            this.denominator = randGen.nextInt(-100,100) + 1;
        }
    }

    //create a toString method that displays the Rational object
    public String toString() {
        return numerator + "/" + denominator;
    }

    //create a constructor that takes two arguments and sets the numerator and denominator
    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
        //throw an exception if the denominator is 0
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }
    //getter and setter methods for numerator and denominator
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        denominator = d;
    }
    
    //create a method that reverses the sign of the rational number
    public void negate() {
        //the return type should be void because you are just changing the attributes of
        numerator = -numerator;
    }

    //create a method that swaps the numerator and the denominator 
    public void invert() {
        //the return type should be void because you are just changing the attributes of
        //the existing object instead of returning a new object 
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //create a method that returns the double value of the rational number
    public double toDouble() {
        //the return type should be double because you are returning a double value
        return (double) numerator / denominator;
    }
    
    //**challenge** euclidean algorithm
    public Rational reduce() {
        int rNumerator = numerator;
        int rDenominator = denominator;
        int remainder = rNumerator % rDenominator;
        while (remainder != 0) {
            rNumerator = rDenominator;
            rDenominator = remainder;
            remainder = rNumerator % rDenominator;
        } 
        rNumerator = numerator / rDenominator;
        rDenominator = denominator / rDenominator;
        return new Rational(rNumerator, rDenominator);
        //this reduced rational is stored as r4 in the main method
    }

    //creating a method that takes a rational object as an argunment and adds it to the current rational object
    //and returns a new rational object with the sum
    public Rational add(Rational r) {
        //create a new Rational object that will be the sum of the two rational objects
        Rational sum = new Rational();
        //create a common denominator
        int commonDenominator = denominator * r.getDenominator();
        //create a new numerator for the sum
        int newNumerator = (numerator * r.getDenominator()) + (r.getNumerator() * denominator);
        //set the numerator and denominator of the sum
        sum.setNumerator(newNumerator);
        sum.setDenominator(commonDenominator);
        return sum;
    }

    
}
