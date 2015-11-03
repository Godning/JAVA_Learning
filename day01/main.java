package main;
/*
 * 要求：
 * 给出学生的个数和每个学生的成绩，请给出最高分和每个学生分数的等级。
 * 等级按照于最高分的差距每10分为一档递降，分别为A，B，C，D。
 */
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生的个数");

		int count = s.nextInt();
		int maxScore = 0;
		int[] scores = new int[count];
		System.out.println("请输入"+count+"个成绩：");
		for (int i = 0; i < count; i++) {
			int score = s.nextInt();
			scores[i] = score;
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		System.out.println("最高分为：" + maxScore);
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
