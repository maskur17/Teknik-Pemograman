package Listing6;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("what is the highest number you can draw?");
		int n = in.nextInt();
		
		BigInteger lottery0dds = BigInteger.valueOf(1);
		
		for (int i = 1; i <= k; i++)
			lottery0dds = lottery0dds.multiply(BigInteger.valueOf(n-1+1)).divide(BigInteger.valueOf(i));
		System.out.println("Your odds are 1 in " + lottery0dds + ".Good Luck!");
			
	}
}
