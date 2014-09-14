import java.util.Scanner;

public class _03_PointsInsideFigure {

	private static boolean insideRectangle(double xCoord, double yCoord, double x, double x1, double y,double y1) {
		
		if (xCoord >= x && xCoord <= x1 && yCoord >= y && yCoord <= y1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X: ");
		double xCoord = input.nextDouble();
		System.out.print("Enter Y: ");
		double yCoord = input.nextDouble();
		
		boolean checkRectangle1 = insideRectangle(xCoord, yCoord,12.5,22.5,6,8.5);
		boolean checkRectangle2 = insideRectangle(xCoord, yCoord,12.5,17.5,8.5,13.5);
		boolean checkRectangle3 = insideRectangle(xCoord, yCoord,20,22.5,8.5,13.5);
		
		if (checkRectangle1 || checkRectangle2  || checkRectangle3) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
		
	}

}
