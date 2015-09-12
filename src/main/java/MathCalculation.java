package main.java;

/**
 * **********************************************************
 * Created by Evgeny Grushko on on 10.09.2015.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class MathCalculation {

    public static int calculateWay(int number) {
        // Exceptional cases
        if (number < 0) {
            throw new ArithmeticException("Sorry, this operation is possible only for positive numbers. Check the input file please.");
        }
        int startPartOfSum = 0;
        int endPartOfSum = number;
        int counter = 0;
        while (startPartOfSum <= endPartOfSum) {
            double tempSquareOfStartPart = Math.sqrt(startPartOfSum);
            // Check is result is real integer, isInfinite() double check, it's not nesessary
            if ((tempSquareOfStartPart == Math.floor(tempSquareOfStartPart)) && !Double.isInfinite(tempSquareOfStartPart)) {
                double tempSquareOfEndPart = Math.sqrt(endPartOfSum);
                if ((tempSquareOfEndPart == Math.floor(tempSquareOfEndPart)) && !Double.isInfinite(tempSquareOfEndPart)) {
                    counter++;
                }
            }
            startPartOfSum++;
            endPartOfSum--;
        }
        return counter;
    }
}
