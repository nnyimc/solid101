package fr.nnyimc.patterns.template;

public abstract class Algorithm {
	
	protected int[] nums;
	
	public Algorithm(int[] nums) {
		this.nums = nums;
	}
	
	protected abstract void initialize();
	protected abstract void sort();
	protected abstract void displayResults();
	
	protected void swap (int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
	
	public final void execute() {
		initialize();
		sort();
		displayResults();
	}
}
