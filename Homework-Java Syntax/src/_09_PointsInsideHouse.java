import java.util.Scanner;


public class _09_PointsInsideHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X: ");
		double xCoord = input.nextDouble();
		System.out.print("Enter Y: ");
		double yCoord = input.nextDouble();
		boolean checkRectangle1 = insideRectangle(xCoord, yCoord,12.5,17.5,8.5,13.5);
		boolean checkRectangle2 = insideRectangle(xCoord, yCoord,20,22.5,8.5,13.5);
		boolean checkTriangle =   insideTriangle(xCoord, yCoord,12.5,8.5,17.5,3.5,22.5,8.5);
		if (checkRectangle1 || checkRectangle2  || checkTriangle) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
		
	}

	private static boolean insideTriangle(double xCoord, double yCoord, double x1, double y1, double x2, double y2, double x3,double y3)
	{
		double ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double ABP = Math.abs (x1 * (y2 - yCoord) + x2 * (yCoord - y1) + xCoord * (y1 - y2));
		double APC = Math.abs (x1 * (yCoord - y3) + xCoord * (y3 - y1) + x3 * (y1 - yCoord));
		double PBC = Math.abs (xCoord * (y2 - y3) + x2 * (y3 - yCoord) + x3 * (yCoord - y2));
        boolean isInTriangle = (ABP + APC + PBC == ABC);
		
		return isInTriangle;
	}
	
	private static boolean insideRectangle(double xCoord, double yCoord, double x, double x1, double y,double y1) {
		
			if (xCoord >= x && xCoord <= x1 && yCoord >= y && yCoord <= y1) {
				return true;
			} else {
				return false;
			}
	}
	
	

}
