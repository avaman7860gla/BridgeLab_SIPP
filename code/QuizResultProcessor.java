package com.gla;

import java.util.ArrayList;
import java.util.List;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}


public class QuizResultProcessor {

	public static int calcScore(String[] corrAns, String[] userAns) throws InvalidQuizSubmissionException {
		if(corrAns.length!=userAns.length) {
			throw new InvalidQuizSubmissionException("not matched");
		}
		
		int score=0;
		for(int i=0;i<corrAns.length;i++) {
			if(corrAns[i].equalsIgnoreCase(userAns[i])) {
				score++;
			}
		}
		return score;
	}
	
	public static String calcGrade(int score, int n) {
		double percentage=(score*100.0)/n;
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "F";
	}
	
	
	public static void processQuiz(String[] corrAns, String[] userAns, List<Integer> allScores) throws InvalidQuizSubmissionException {
        int score = calcScore(corrAns, userAns);
        allScores.add(score);
        String grade = calcGrade(score, corrAns.length);

        System.out.println("User Score: " + score + "/" + corrAns.length);
        System.out.println("Grade: " + grade);
    }
	
	
	public static void main(String[] args) {
		String[] correctAnswers = { "A", "B", "C", "D", "A" };

        String[][] submissions = {
            { "A", "B", "C", "D", "A" }, 
            { "A", "C", "C", "D", "B" }, 
            { "B", "B", "A", "C", "D" }  
        };

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < submissions.length; i++) {
           
        	System.out.println("User :+" + (i + 1));
            
            try {
                processQuiz(correctAnswers, submissions[i], scores);
            }
            catch (InvalidQuizSubmissionException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            System.out.println("-----------------------------");
        }

        System.out.println("All User Scores: " + scores);
	}
}
