
package arrays;

import java.util.Scanner;

public class ConsicutiveElementsInnArrays {

	public static void main(String[] args) {
		int[] arr=readData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target value");
		int target = sc.nextInt();
	    System.out.println(containsConsecutiveElements(arr, target));
	    System.out.println(validateInputs(arr, target));
	}
	public static int validateInputs(int[] arr, int target) {
		if (arr.length == 0) 
			return -1;
		for (int i : arr) {
		if (i <= 0)
			return -2;
		}
		if (target <= 0) 
			return -3;
		return 1;
}
	public static boolean containsConsecutiveElements(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++) {
	        int sum = 0;
	        for (int j = i; j < arr.length; j++) {
	            sum += arr[j];
	            if (sum == target) {
	                return true;
	            }
	        }
	    }
	    return false;
	}	
	public static int[] readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter elements in array");
		for (int i =0;i<arr.length;i++)
			arr[i]= sc.nextInt();
		return arr;
}
}