package my.arrays.prob;

public class Array {
	
	private int length;
	private int[] arr;
	
	public Array() {
		
	}
	
	public Array(int length) {
		this.length = length;
		this.arr = new int[length];
	}
	
	public void fillArray() {
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = ((int)(Math.random() * 100));
		}
	}
	
	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public int getLength() {
		return this.length;
	}
	
	public void reverse() {
		int[] arr2 = new int[this.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - i - 1];
			System.out.print(arr2[i] + " ");
		}
	}
	
	public void bubbleSort() {
		int in, out;
		for (out = length-1; out > 1; out--){
			for (in = 0; in < out; in++){
				if (arr[in] > arr[in+1]){
					swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int one, int two) { 		
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
	
	public void evenOdd() {
		int[] arr2 = new int[length];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
			}
			else {
				System.out.print("no ");
			}
		}
	}
	
}
