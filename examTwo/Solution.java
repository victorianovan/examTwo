

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
		int index;
		int index2 = 0;
		char ch;
		char ch2 = 0;
		char ch3 = 0;
		int[] array;
		int count = 0;
		
		for(index=0;index<str.length();index++){
			ch = str.charAt(index);
			if (index + 1 < str.length()) {
				ch2 = str.charAt(index + 1);
			}
			if (index + 2 < str.length()) {
				ch3 = str.charAt(index + 2);
			}

			if (ch >= '0' && ch <= '9') { 
				if (ch2 == 43 || ch2 == 45) {
					if (ch3 >='0' && ch3 <= '9') {
						count--;
					}
				}
				count++;
			}
		}
		array=new int[count];
		for(index=0;index<str.length();index++){
			ch = str.charAt(index);
			if(ch >= '0' && ch <= 57 ) {
				if (ch2 == 43 || ch2 == 45) {
					if (ch3 >='0' && ch3 <= '9') {
						array[index2] = ch - '0';
						index2++;
					}
					}
			}
		
          if (index + 1 < str.length()) {
				ch2 = str.charAt(index + 1);
			}
			if (index + 2 < str.length()) {
				ch3 = str.charAt(index + 2);
			}
			if (ch >= 48 && ch <= 57) {
				if (ch2 == 43) {
					 array[index2] = (ch - '0') + (ch3 - '0');
					 index += 3;
				} else if (ch2 == 45) {
					 array[index2] = (ch -'0') - (ch3 - '0');
					 index += 3;
				}

			 index2++;
			}
		}                                                               
		return array;}}
	
		

	


