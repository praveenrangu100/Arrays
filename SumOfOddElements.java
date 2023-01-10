package arrays;

import java.util.Scanner;

public class SumOfOddElements {

	public static void main(String[] args) {
		int[] arr=readData();
		sumArray(arr);

	}

	public static void sumArray(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0) {
			sum = sum + arr[i];
			}
		}
		 System.out.println(sum);
		
	}

	public static int[] readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[]= new int[size];
		for (int i =0;i<arr.length;i++)
			arr[i]= sc.nextInt();
		return arr;

	}

}
