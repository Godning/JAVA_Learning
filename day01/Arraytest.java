package main;

public class Arraytest {
	public static void main(String[] agrs) {
		int arr[] = new int[] { 12, 49, 9, 0, -5, 100, -90, 3, 5, 328 };

		// max
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("Max: " + max);
		// min
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("Min: " + min);
		// sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
		// average
		int avg = 0;
		avg = sum / arr.length;
		System.out.println("Avg: " + avg);
	}
}
