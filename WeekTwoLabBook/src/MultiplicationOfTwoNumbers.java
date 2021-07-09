import java.util.Scanner;

public class MultiplicationOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the value of i:");
		int i= scan.nextInt();
		
		System.out.println("Enter the value of j:");
		int j= scan.nextInt();
		
		int mul=i*j;
		System.out.println("The Multiplication of i and j is:" +mul);
		
	}

}
