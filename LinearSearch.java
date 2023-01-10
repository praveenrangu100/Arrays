package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr=readData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find");
		int search= sc.nextInt();
		searchElement(arr,search);
	}
	public static void searchElement(int[] arr, int search) {
		boolean flag = false;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==search) {
				System.out.println("Element found at index :"+ i);
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("Element not found");
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
