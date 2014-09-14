import java.math.BigDecimal;
import java.util.Scanner;

public class _07_CountBitsOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to count bits 1: ");
		long num = input.nextLong();
		int counter = 0;
	    while (num != 0) {
	        num &= num - 1;
	        counter++;
	    }
		System.out.println("Bits with 1 are: "+ counter);
	}

}
