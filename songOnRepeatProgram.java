import java.util.Scanner;

public class songOnRepeatProgram {
	
	public static void main(String[] args) {
		Scanner abhi = new Scanner(System.in);
		boolean isOnRepeat = true;
		while(isOnRepeat) {
			System.out.println("Playing current song.");
			System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
			String userInput = abhi.next();
			
			if(userInput.equals("yes")) {
				isOnRepeat = false;
			}
		}
           System.out.println("Playing next song.");
	}

}
