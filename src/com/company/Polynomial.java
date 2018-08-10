package com.company;
import java.math.*;
public class Polynomial {
    double degrees[];
    double coefficients[];
    int index;

    //takes in an int describing polynomials degree
    Polynomial(int degree){
        this.degrees = new double[degree];
        this.coefficients = new double[degree];
        this.index = 0;

    }

    public void setCoefficient(int degree, int coefficient){
         this.degrees[this.index] = degree;
         this.coefficients[this.index] = coefficient;
         this.index++;
    }

    public double evaluate(double xValue){

        double result = 0;
        for(int i = 0; i < this.index; i++){
            result += this.coefficients[i] * Math.pow(xValue, this.degrees[i]);
        }
        return result;
    }
}
