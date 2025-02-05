package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want the max integer to be?");
		int N = in.nextInt();
		boolean [] numberList = new boolean[N];
			for (int i = 2; i < N; i++) {
				numberList[i] = true; 
			}
			for (int i = 2; i < N; i++) {
				if (numberList[i] == true) {
				 for (int j = i*i; j < N; j+=i) {
					numberList[j] = false; 
				 }
				}
				if (numberList[i] == true) {
					System.out.println(i);
				}
				} 
}
}
