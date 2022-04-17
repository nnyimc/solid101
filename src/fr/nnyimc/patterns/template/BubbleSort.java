package fr.nnyimc.patterns.template;

public class BubbleSort extends Algorithm {

	public BubbleSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {
		System.out.println("initializing the bubble sort algorithm...");
		
	}

	@Override
	protected void sort() {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if ( nums[j] > nums[j + 1]) {
					swap( j, j + 1);
				}
			}
		}
		
	}

	@Override
	protected void displayResults() {
		for ( int i = 0; i < nums.length; i++ ) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\r\n");
	}

}
