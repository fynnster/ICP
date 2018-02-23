/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

/**
 *
 * @author Frema
 */
public class CalculatorClass {
    double number1;
    double number2;

    CalculatorClass(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    public double Add() {
        return number1 + number2;
    }
    public double Subtract() {
        return number1 - number2;
    }
    public double Multiply() {
        return number1 * number2;
    }
    public double Divide() {
        return number1 / number2;
    }
    public double Square() {
        return Math.pow(number1, 2);
    }
    public double Exponent() {
        return Math.pow(number1, number2);
    }
    
    public static void main(String[] args) {
        double number1 = 2;
        double number2 = 4;
        CalculatorClass mathStuff = new CalculatorClass(number1, number1);
        // show outputs from calculations
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Addition: " + mathStuff.Add());
        System.out.println("Subtraction: " + mathStuff.Subtract());
        System.out.println("Multiplication: " + mathStuff.Multiply());
        System.out.println("Division: " + mathStuff.Divide());
        System.out.println("Square: " + mathStuff.Square());
        System.out.println("Exponent: " + mathStuff.Exponent());
    }
}
