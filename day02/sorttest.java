package main;

import java.util.Arrays;

public class sorttest {
	public static void main(String[] args) {
		int[] b = new int[] { 1, 5, 2, 3, 7, 8, 4, 19, 20, 6 };
		Arrays.sort(b);
		// 遍历
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int[] a = new int[] { 1, 5, 2, 3, 7, 8, 4, 19, 20, 6 };
		// 冒泡排序
		// for (int i = 0; i < a.length - 1; i++) {
		// for (int j = 0; j < a.length - i - 1; j++) {
		// if (a[j] < a[j + 1]) {
		// int temp = a[j];
		// a[j] = a[j+1];
		// a[j+1] = temp;
		// }
		// }
		// }
		// //遍历
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }
		// 直接选择排序
		for (int i = 0; i < a.length - 1; i++) {
			int t=i;//默认i处事最小的
			for (int j = i; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
				//优化
				if(a[t]>a[j]){
					t=j;
				}
			}
			if(t!=i){
				int temp = a[i];
				a[i] = a[t];
				a[t] = temp;
			}
		}
		// 遍历
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
