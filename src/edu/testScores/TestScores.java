package edu.testScores;

import java.util.ArrayList;

/**
 * @author Tim Ortin
 * @version 1.0
 *
 * Class creates, adds and averages test scores in an array list
 */


public class TestScores {


    private static ArrayList<Integer> scores = new ArrayList<>();

    /**
     * Constructor of TestScores object
     *
     * @param scores ArrayList of test scores
     */
    public TestScores(ArrayList<Integer> scores) {
        this.scores = scores;

    }

    /**
     * Custructor of TestScores object that takes no parameters
     */
    public TestScores() {

    }

    /**
     * method adds individual test scores to array list
     *
     * @param i integer of a test score
     */
    public static void addScoresToArrayList(int i) {
        scores.add(i);

    }

    /**
     * @param scores array list list of test scores
     * @return average of test scores in the scores array list
     * @throws InvalidTestScores
     */
    public double averageTestScore(ArrayList<Integer> scores) throws InvalidTestScores {
        this.scores = scores;
        double totalScores = 0;
        int numberOfScores = scores.size();

        for (int i = 0; i < scores.size(); i++) {
            totalScores += scores.get(i);
        }
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 0 || scores.get(i) > 100) {
                throw new InvalidTestScores("Scores must be between 1 and 100");
            }

        }

        return totalScores / numberOfScores;
    }


}
