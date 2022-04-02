package fr.nnyimc.singleresponsibility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsability {

	public static final int THRESHOLD=5;
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Application");
		
		List<Integer> nums = scanInputs();
		sort(nums);
		displayResult(nums);
	}

	private static void displayResult(List<Integer> nums) {
		for (int num : nums ) {
			System.out.println(num + " ");
		}
	}

	private static void sort(List<Integer> nums) {
		Collections.sort(nums);
	}

	private static List<Integer> scanInputs() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		System.out.println("Enter 5 valid integers in the range [0,10]");
		
		while (nums.size() < THRESHOLD) {
			String s = scanner.nextLine();
			
			
			if (isValid(s)){
				int num = Integer.parseInt(s);
				nums.add(num);
			}
			
		}
		
		scanner.close();
		return nums;
	}
	
	private static boolean isValid(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException nfe) {
			System.out.println("Invalid, try again !");
			return false;
		}
		
		int num = Integer.parseInt(input);
		
		if (num < 0 || num > 10) {
			System.out.println("Invalid range, try again !!");
			return false;
		}
		
		return true;
	}

}
