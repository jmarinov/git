import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A side: ");
		int aSide = input.nextInt();
		System.out.print("Enter B side: ");
		int bSide = input.nextInt();
		int recArea = aSide * bSide; 
		
		System.out.println("Rectangle Area is: " + recArea);

	}

	
}
 