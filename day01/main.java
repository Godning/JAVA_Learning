package main;
/*
 * Ҫ��
 * ����ѧ���ĸ�����ÿ��ѧ���ĳɼ����������߷ֺ�ÿ��ѧ�������ĵȼ���
 * �ȼ���������߷ֵĲ��ÿ10��Ϊһ���ݽ����ֱ�ΪA��B��C��D��
 */
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ���ĸ���");

		int count = s.nextInt();
		int maxScore = 0;
		int[] scores = new int[count];
		System.out.println("������"+count+"���ɼ���");
		for (int i = 0; i < count; i++) {
			int score = s.nextInt();
			scores[i] = score;
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		System.out.println("��߷�Ϊ��" + maxScore);
		for (int i = 0; i < count; i++) {
			char level;
			if(scores[i]>=maxScore- 10){
				level = 'A';
			}else if(scores[i]>=maxScore- 20){
				level = 'B';
			}else if(scores[i]>=maxScore- 30){
				level = 'C';
			}else {
				level = 'D';
			}
			int id = i+1;
			System.out.println("student "+id+" score is "+scores[i]+" grade "+level);
		}
	}
}
