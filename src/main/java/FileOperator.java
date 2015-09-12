package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * **********************************************************
 * Created by Evgeny Grushko on 10.09.2015 12:32.
 * https://github.com/evgeny-grushko/facebook_hacker_cup
 * ***********************************************************
 */
public class FileOperator {

    public static List<Integer> getInputNumbersFromFile(String pathToFile) throws IOException {
        List<Integer> listOfNumbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listOfNumbers.add(Integer.valueOf(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listOfNumbers;
    }

    public static void writeFile(String path, List<Integer> listOfResults) {
        int size = listOfResults.size();
        int counter = 1;
        // Only in Java 1.7 or higher, FileWriter implements Closeable....
        try (FileWriter writer = new FileWriter(path, false)) {
            for (Integer currentValue : listOfResults) {
                writer.write("Case #" + counter + ": " + currentValue.toString());
                if (size != counter) {
                    writer.append('\n');
                }
                counter++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
