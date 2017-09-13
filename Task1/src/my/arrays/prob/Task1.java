package my.arrays.prob;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
			
		System.out.println("Type length of array: ");
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		
//		Array arrObj = new Array(input);		
//		System.out.println(arrObj.getLength());		
//		arrObj.fillArray();		
//		arrObj.printArray();		
//		arrObj.reverse();		
//		arrObj.bubbleSort();		
//		arrObj.evenOdd();			
//		arrObj.printArray();		
//		System.out.println(arrObj.getLength());
		
		
		SimpleNumbers ar = new SimpleNumbers(input);		
		ar.fillArray();
		ar.printArray();
		ar.SNums();
		
	}

}
