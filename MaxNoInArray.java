package arrays;

import java.util.Scanner;

public class MaxNoInArray {

	public static void main(String[] args) {
		int[] arr=readData();
		maxElement(arr);
	}
	public static void maxElement(int[] arr) {
		int max = 0;
		for(int i = 1; i < arr.length; i++) {
                max = arr[i];
		}
		System.out.println("Maximum element in array is "+max);
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
