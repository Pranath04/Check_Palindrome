package palindrome;

import java.util.Scanner;

public class Palindrome{
	public static int reverse(String A,int start,int end) {
		if(start>=end) {
			return 1;
		}
		if(A.charAt(start)!=A.charAt(end)) {
			return 0;
		}
		return reverse(A,start+1,end-1);
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		scanner.close();
		int start=0;
		int end=A.length()-1;
		System.out.println(reverse(A,start,end));
	}
}