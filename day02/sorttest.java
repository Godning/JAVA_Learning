package main;

import java.util.Arrays;

public class sorttest {
	public static void main(String[] args) {
		int[] b = new int[] { 1, 5, 2, 3, 7, 8, 4, 19, 20, 6 };
		Arrays.sort(b);
		// ����
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int[] a = new int[] { 1, 5, 2, 3, 7, 8, 4, 19, 20, 6 };
		// ð������
		// for (int i = 0; i < a.length - 1; i++) {
		// for (int j = 0; j < a.length - i - 1; j++) {
		// if (a[j] < a[j + 1]) {
		// int temp = a[j];
		// a[j] = a[j+1];
		// a[j+1] = temp;
		// }
		// }
		// }
		// //����
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }
		// ֱ��ѡ������
		for (int i = 0; i < a.length - 1; i++) {
			int t=i;//Ĭ��i������С��
			for (int j = i; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
				//�Ż�
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
		// ����
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
