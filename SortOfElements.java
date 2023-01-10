 package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();
		        int[] arr = new int[size];
		        System.out.println("Enter the elements of the array: ");
		        for (int i = 0; i < size; i++) {
		            arr[i] = sc.nextInt();
		        }
		        int[] sortedArray = sortArray(arr);
		        for (int i = 0; i < size; i++) {
		            System.out.print(sortedArray[i] + " ");
		        }
		    }
		    public static int[] sortArray(int[] arr) {
		        Arrays.sort(arr);
		        return arr;
		    }
	}
