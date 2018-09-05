package edu.testScores;

import java.util.ArrayList;
import java.text.*;
import java.util.Scanner;

/**
 * @author Tim Ortin
 * @version 1.0
 * Driver class
 */

public class Main {

    public static void main(String[] args) throws InvalidTestScores {

        // Variables
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        ArrayList<Integer> testScores = new ArrayList<>();
        int score;
        double average = 0;
        TestScores scores;


        /* option to hard code the test scores
        testScores.add(80);
        testScores.add(75);
        testScores.add(105);
        testScores.add(90);
        testScores.add(58);
        testScores.add(78);
        */

        // Instantiates testScores object
        scores = new TestScores(testScores);

        System.out.println("Enter a test Score");
        score = keyboard.nextInt();
        scores.addScoresToArrayList(score);
        System.out.println("Enter a test Score");
        score = keyboard.nextInt();
        scores.addScoresToArrayList(score);System.out.println("Enter a test Score");
        score = keyboard.nextInt();
        scores.addScoresToArrayList(score);
        System.out.println("Enter a test Score");
        score = keyboard.nextInt();
        scores.addScoresToArrayList(score);

        // sets average to result of averageTestScore method in testScores
        average = scores.averageTestScore(testScores);

        // prints out the individual test scores and the average
        System.out.println("Test Scores:\n" + testScores.toString());
        System.out.println("\nThe average score was: " + decimal.format(average));


    }
}
