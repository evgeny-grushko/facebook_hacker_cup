package main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * **********************************************************
 * Created by Evgeny Grushko on 09.09.2015 17:52.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class QualificationRoundTaskOne {

    static SomeThing someThing;

    static ExecutorService executor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws IOException {


        long startTime = System.currentTimeMillis();


        List<Integer> listOfResults = new ArrayList<>();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                FileOperator.writeFile(System.getProperty("user.dir") + "/output.txt", listOfResults);
                long endTime = System.currentTimeMillis();
                System.out.println("Execution time of program in seconds: " + ExecutionTimer.measureSecBetweenTimestamps(startTime, endTime));
            }
        });

        List<Integer> listOfNumbers = FileOperator.getInputNumbersFromFile(System.getProperty("user.dir") + "/input.txt");
        for (int i = 1; i <= listOfNumbers.get(0); i++) {
            final Integer foo = listOfNumbers.get(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    listOfResults.add(MathCalculation.calculateWay(foo));
                }
            }).start();

        }

    }

}

