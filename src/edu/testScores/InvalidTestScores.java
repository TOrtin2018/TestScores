package edu.testScores;

/**
 * @author Tim Ortin
 * @version 1.0
 * Class creates a custom IllegalArgumentException
 */

public class InvalidTestScores extends Exception {

    /**
     *
     * @param errorMessage String of error message. Uses the super class message for constructor
     */
    public InvalidTestScores(String errorMessage) {

        super(errorMessage);
    }


}
