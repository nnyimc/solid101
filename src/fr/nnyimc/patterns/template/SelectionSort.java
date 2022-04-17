package fr.nnyimc.patterns.template;

public class SelectionSort extends Algorithm {

	public SelectionSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {
		System.out.println("initializing the selection sort algorithm...");
		
	}

	@Override
	protected void sort() {
		for (int i = 0; i < nums.length -1; ++i) {
			int index = i;
			
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			
			if (index != i) {
				swap(i, index);
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
