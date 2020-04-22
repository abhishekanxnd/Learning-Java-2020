import java.util.Scanner;

public class MultipleChoiceChallenge {

	public static void main(String[] args) {
		Scanner abhi = new Scanner(System.in);
		
		String choiceOne = "-61500";
		String choiceTwo = "748";
		String choiceThree = "750";
		String question = "What is 250 x 4 - 251 + 1? \nChoose from: " + choiceOne + " , " + choiceTwo + " & " + choiceThree + ".";
		
		
		String correctAnswer = choiceThree;
		
		System.out.println(question);
		
		String userInput = abhi.next();
		
		if(userInput.toLowerCase().equals(correctAnswer)) {
			System.out.println("Congratulations! You are correct.");
		} else if (userInput.toLowerCase().equals(choiceTwo)) {
			System.out.println("Wrong! The correct answer is " + correctAnswer);
		} else if (userInput.toLowerCase().equals(choiceOne)){
			System.out.println("Wrong! The correct answer is " + correctAnswer);
		} else {
			System.out.println("That is not a valid option. Try again.");
		    System.exit(0);
		}
	}
}
