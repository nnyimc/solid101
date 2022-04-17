package fr.nnyimc.patterns.template;

public class App {
	
	public static void main (String... args) {
		
		int[] nums = {2, -6, 3, 9, 5, 1, -10, 2, 3, 20, 7};
		Algorithm bubbleSorting = new BubbleSort(nums);
		bubbleSorting.execute();
		
		Algorithm selectionSorting = new SelectionSort(nums);
		selectionSorting.execute();
		
	}
	
}
