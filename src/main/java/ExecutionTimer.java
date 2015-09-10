package main.java;

/**
 * **********************************************************
 * Created by Evgeny Grushko on 10.09.2015 11:37.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class ExecutionTimer {
    //return result in seconds
    public static int measureSecBetweenTimestamps(long startTime, long endTime) {
        return (int) Math.floor((endTime - startTime) / 1000);
    }
}
