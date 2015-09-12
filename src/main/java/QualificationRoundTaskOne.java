package main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * **********************************************************
 * Created by Evgeny Grushko on 09.09.2015 17:52.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class QualificationRoundTaskOne {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        List<Integer> listOfNumbers = FileOperator.getInputNumbersFromFile(System.getProperty("user.dir") + "/input.txt");
        List<Integer> listOfResults = new ArrayList<>();
        for (int i = 1; i <= listOfNumbers.get(0); i++) {
            listOfResults.add(MathCalculation.calculateWay(listOfNumbers.get(i)));
        }
        FileOperator.writeFile(System.getProperty("user.dir") + "/output.txt", listOfResults);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time of program in seconds: " + ExecutionTimer.measureSecBetweenTimestamps(startTime, endTime));
    }


}

