package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String s0 = scan.nextLine();
		System.out.print("Enter value for arg 1: ");
		String s1 = scan.nextLine();
		System.out.print("Enter value for arg 2: ");
		String s2 = scan.nextLine();
		System.out.print("Enter value for arg 3: ");
		String s3 = scan.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println(s0+", "+ s1+" ,"+ s2+ ", and " + s3 + ".");
	}
}
