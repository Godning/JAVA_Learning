package main;
//Êı×éÇ³¸´ÖÆ
public class Arraycopy {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		
		for(int i = 0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		array2=array1;
		for(int i = 0;i<array2.length;i++){
			array2[i]=i;
		}
		for(int i = 0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
	}
}
