package day08;
//�������ʵ����ȫ����
/*�ṹ:
 * class Creator(age)
 * class Animal extends Creator(name)
 * class Dog extends Animal(hostName)
 */
public class Testdog {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setAge(10);
		d.setName("huahua");
		d.setHostName("xiaoming");
		
		System.out.println("name: "+ d.getName()+" age: "+d.getAge()+ " hostname: "+d.getHostName());
		System.out.println(d.toString());
	}
}
//����
class Creator{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Creator() {
		super();
		System.out.println("This is Creator constructor!");
	}
	
	
}
//����
class Animal extends Creator{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal(){
		super();
		System.out.println("This is Animal constructor!");
	}
}
//��
class Dog extends Animal{
	private String hostName;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	public Dog(){
		super();
		System.out.println("This is Dog constructor!");
	}
}