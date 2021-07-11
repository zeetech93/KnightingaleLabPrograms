import java.util.Scanner; 
public class FindAreaOfACircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		 System.out.print("Enter the radius: "); 
		 
		 double radius = scanner.nextDouble(); 
		 
		double area = Math.PI * (radius * radius); 
		 System.out.println("The area of circle is: " + area); 
		 
		double circumference= Math.PI * 2*radius; 
	System.out.println( "The circumference of the circle is:"+circumference) ; 
	}

}
