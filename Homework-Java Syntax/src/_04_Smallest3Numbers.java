import java.util.Scanner;


public class _04_Smallest3Numbers {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double aNum = input.nextDouble();
		System.out.print("Enter b: ");
		double bNum = input.nextDouble();
		System.out.print("Enter c: ");
		double cNum = input.nextDouble();
		double minNum = -Double.MAX_VALUE;
		if(aNum > bNum) {
			minNum = bNum;
		} else {
			minNum = aNum;
		}	
		if(minNum > cNum){
			minNum = cNum;
		}
		System.out.println(minNum);
	}
}
