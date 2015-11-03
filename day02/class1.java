package classmod;
/*
 * 创建Person类，要求：
 * (1):三个属性 name,age,sex，
 * 三个方法study(输出字符串“studying),showAge(显示age的值),
 * addAge(给对象age属性增加2岁)
 * (2):在另一类中调用这个类，测试上述功能
 */
public class class1 {
	public static void main(String[] args) {
		
	}
}
//类：人
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
