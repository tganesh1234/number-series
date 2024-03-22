package gani.assignments;

import java.util.Scanner;

public class Numberseries3 {

	public static void main(String[] args) {
		// print numbers in a series of length n
		int n;
		System.out.print("enter the length of series :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
