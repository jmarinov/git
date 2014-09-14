import java.util.Scanner;


public class _02_TriangleArea {

	public static double calcArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		double area = 1.0d;
		area = Math.abs((x1*(y2-y3) + x2*(y3 - y1)+ x3*(y1 - y2)) / 2);
		
		return area;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X1: ");
		double x1 = input.nextDouble();
		System.out.print("Enter Y1: ");
		double y1 = input.nextDouble();
		System.out.print("Enter X2: ");
		double x2 = input.nextDouble();
		System.out.print("Enter Y2: ");
		double y2 = input.nextDouble();
		System.out.print("Enter X3: ");
		double x3 = input.nextDouble();
		System.out.print("Enter Y3: ");
		double y3 = input.nextDouble();
		int result = (int)calcArea(x1,y1,x2,y2,x3,y3);
		System.out.print("Triangle area is: " + result);
	}

}
