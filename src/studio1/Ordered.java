package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = scan.nextInt();
		System.out.println("Value for y?");
		int y = scan.nextInt();
		System.out.println("Value for z?");
		int z = scan.nextInt();
		boolean A = x > y ;
		boolean B = y > z ;
		boolean C = x == y;
		boolean D = y == z;
		boolean isOrdered = A==B;
		boolean isOrdered ;
		
		System.out.println(isOrdered);
	}

}
