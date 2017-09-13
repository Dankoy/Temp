package my.arrays.prob;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Type length of array: ");
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		SimpleNumbers ar = new SimpleNumbers(input);		
		ar.fillArray();
		ar.printArray();
		ar.SNums();

	}

}
