import java.util.Scanner;

public class _05_DecToHex {
	
	public static void main(String[] args) {
     	    Scanner input = new Scanner(System.in);
			System.out.print("Enter decimal number:");
			Integer decimal = input.nextInt();
			String outputHex = Integer.toHexString(decimal).toUpperCase();
	        System.out.println("Hexadecimal Value:"+outputHex);
	}
}
