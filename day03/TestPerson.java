package day06;
/*
 *  类的使用实例，包括访问控制和异常处理
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
			throw new RuntimeException("输入的数据有误");
		}
	}
}
