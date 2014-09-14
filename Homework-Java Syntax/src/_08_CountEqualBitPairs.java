import java.util.Scanner;

public class _08_CountEqualBitPairs {
    
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to count bits pairs: ");
		int num = input.nextInt();
		int onesPairs = countPairs(num);
		int numBitsInvert = invertBits(num);
		int zerosPairs = countPairs(numBitsInvert);
		System.out.println("Counted pairs are: "+ (onesPairs + zerosPairs));
	
	}
	
	public static int countPairs(int value){
		int counter = 0;	
		for (int i = 0; i < 31; i++) {
			if ( ((value & (1<<i)) != 0) && ((value & (1<<i-1)) !=0 )) {
				counter++;
				} 
		}
			return counter;
	}
	
	public static int invertBits (int n) {
        int pow2 = 1;
        int bit = 0;
            int invertedNum = 0;
            while ( n > 0) {
              bit = (n & 1);
              if ( bit == 0 )
            	  invertedNum += pow2;
              n = n >> 1;
              pow2 *= 2;
          }
          return invertedNum;
        }
	
}
