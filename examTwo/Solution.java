

import java.util.Scanner;

public class Solution{

	public static void main(String[] args) {
		String str;
		int[] numbers;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("String: ");
		str = keyboard.nextLine();
		numbers=oddEvens(str);
		showArray(numbers);
		keyboard.close();
	}
	
	public static void showArray(int[] array) {
		int index;
		
		System.out.print("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) System.out.print(",");
			System.out.print(array[index]);
		}
		System.out.println("]");
	}
	
	public static int[] oddEvens(String str) {
	//** Implement this method according to the instruction and examples on
	//** the repo README.md file.

		return null;
	}
	

}
