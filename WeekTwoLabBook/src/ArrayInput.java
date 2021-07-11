import java.util.Scanner; 
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		 int[] array = new int[5]; 
		 int sum = 0; 
		 System.out.println("Enter the elements:"); 
		 for (int i=0; i<5; i++) 
		 { 
		 array[i] = scanner.nextInt(); 
		 } 
		 for( int num : array) { 
		 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum); 
	}

}
