package arraysChallenge;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myIntegers = getIntegers(5);
		myIntegers = sortIntegers(myIntegers);
		printArray(myIntegers);
		
	}//end of main method
	
	public static int[] getIntegers(int number){
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for(int i=0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}//end of get integer
	

	public static void printArray(int[] array){
		System.out.println( Arrays.toString(array));
		for(int i=0; i<array.length;i++){
		System.out.println( array[i]);
		}
	}//end of print array
		
	public static int[] sortIntegers(int[] array){
		int[] newArray =  array;
		Arrays.sort(newArray);
		return newArray;
	}//end of sort integers


}
