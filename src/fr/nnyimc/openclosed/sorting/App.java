package fr.nnyimc.openclosed.sorting;

public class App {

	public static void main(String[] args) {
		
		MergeSorter mergeSorter = new MergeSorter();
		InsertionSorter insertionSorter = new InsertionSorter();
		SelectionSorter selectionSorter = new SelectionSorter();
		SortingProcessor sortingProcessor = new SortingProcessor();
		
		sortingProcessor.sort(mergeSorter);
		sortingProcessor.sort(insertionSorter);
		sortingProcessor.sort(selectionSorter);
	}

}
