import java.util.Scanner;


public class _06_FormatingNumbers {

	public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
			System.out.print("Enter a: ");
			int aNum = input.nextInt();
			System.out.print("Enter b: ");
			double bNum = input.nextDouble();
			System.out.print("Enter c: ");
			double cNum = input.nextDouble();
			String hex = Integer.toString(aNum,16);
		    int binary = Integer.parseInt(Integer.toString(aNum,2));
			System.out.printf("\n|%-10S|%010d|%10.2f|%-10.3f|",hex,binary,bNum,cNum);
			
	}

}
