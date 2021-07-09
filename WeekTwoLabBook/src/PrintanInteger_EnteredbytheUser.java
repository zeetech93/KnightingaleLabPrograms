import java.util.Scanner;

public class PrintanInteger_EnteredbytheUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number...:");
		
		int number = reader.nextInt();
		System.out.println("You entered...:" + number);
	}

}
