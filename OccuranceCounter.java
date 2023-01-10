package arrays;

import java.util.Scanner;

public class OccuranceCounter {

	public static void main(String[] args) {
		int[] arr=readData();
		/*Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number you want to count:");
	        int x = sc.nextInt();*/
	      	getOccurrences(arr);
	}
	public static void getOccurrences(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
		     for(int j=0;j<arr.length;j++) {
		        if(arr[i]==arr[j])
		        	count+=1;
		   			if(count>=2) 
		   			arr[i]=-1;
		            }
		 if(arr[i]!=-1)
		 	 System.out.println("Number of occurrences of "+arr[i]+" : " + count);
		 count=0;
		        }
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
