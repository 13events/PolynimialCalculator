package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        int degree;
        int value;
        String userPrompt = "yes";
        String[] strNums;
        Polynomial myPoly;
        BufferedReader bi = new BufferedReader((new InputStreamReader(System.in)));
        Scanner myScanner = new Scanner(System.in);


        //prompt user
        System.out.print("Enter a polynomial starting with its degree: ");
        strNums = bi.readLine().split("\\s");

        //get degree first
        degree = Integer.parseInt(strNums[0]);
        myPoly = new Polynomial(degree);

        //set the rest of the polynomial
        for(int i = 1; i < strNums.length; i++){
            int input;
            input = Integer.parseInt(strNums[i]);
            if(input != 0){
                myPoly.setCoefficient(degree, input);

            }
            degree--;
        }

        /*
        System.out.println("Enter a value> ");
        value = myScanner.nextInt();
        System.out.print("The result is: " + myPoly.evaluate(value));
        System.out.println("Continue?(Yes/No>");
        userPrompt = myScanner.next();
        */
        while(userPrompt.equals("yes") || userPrompt.equals("Yes")){
            System.out.print("Enter a value> ");
            value = myScanner.nextInt();
            System.out.println("The result is: " + myPoly.evaluate(value));
            System.out.print("Continue?(Yes/No>");
            userPrompt = myScanner.next();
        }



    }
}
