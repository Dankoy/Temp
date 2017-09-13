package my.arrays.prob;

public class SimpleNumbers {
	
	private int nums;
	private int[] arr;
	
	public SimpleNumbers() {
		
	}
	public SimpleNumbers(int n) {
		this.arr = new int[n];
		this.nums = n;
	}
	
	public void fillArray() {
		for(int i = 0; i < nums; i++) {
			arr[i] = i;
		}
	}
	
	public void printArray() {
		for(int i = 0; i < nums; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// The prime numbers searching algo
	public void SNums() {
		for(int i = 0; i < nums; i++) {
			boolean isPrime = true;
			int sn = arr[i];
			
			if ((sn == 0) || (sn == 1)) {
				isPrime = false;
			}
			else {
			for( int k=2; k <= Math.sqrt(sn); k++) {
					if(sn % k == 0) {
						isPrime = false;
						break;
					}
				}
			if (isPrime) {
				System.out.print(sn + " ");
			}
		}	
		}	
	}
}
