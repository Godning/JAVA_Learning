package classmod;
/*
 * ����Person�࣬Ҫ��
 * (1):�������� name,age,sex��
 * ��������study(����ַ�����studying),showAge(��ʾage��ֵ),
 * addAge(������age��������2��)
 * (2):����һ���е�������࣬������������
 */
public class class1 {
	public static void main(String[] args) {
		
	}
}
//�ࣺ��
class Person{
	private String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println("Age: "+age);
	}
	
	public int addAge(int i){
		age += i;
		return age;
	}
	
}
