package day06;
/*
 *  ���ʹ��ʵ�����������ʿ��ƺ��쳣����
 */

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setAge(150);			
		}catch(RuntimeException e){
			System.out.println(e);
		}
		System.out.println(p.getAge());
	}
}

class Person{
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		if(a>0 && a<=130){
			age = a;
		}else{
			throw new RuntimeException("�������������");
		}
	}
}
