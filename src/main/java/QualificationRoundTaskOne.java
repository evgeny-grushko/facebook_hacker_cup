package main.java;

import java.util.ArrayList;

/**
 * **********************************************************
 * Created by Evgeny Grushko on 09.09.2015 17:52.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class QualificationRoundTaskOne {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ArrayList<Integer> listOfNumbers = FileOperator.getInputNumbersFromFile(System.getProperty("user.dir") + "/input.txt");
        int numberOfCases = listOfNumbers.get(0);
        listOfNumbers.remove(0);
        ArrayList<Integer> listOfResults = new ArrayList<>();
        for (int i = 0; i < numberOfCases; i++) {
            listOfResults.add(MathCalculation.calculateWay(listOfNumbers.get(i)));
        }
        FileOperator.writeFile(System.getProperty("user.dir") + "/output.txt", listOfResults);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time of program in seconds: " + ExecutionTimer.measureSecBetweenTimestamps(startTime, endTime));
    }



}

