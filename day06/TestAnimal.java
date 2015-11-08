package day08;


public class TestAnimal {
	public static void main(String[] args) {
		TestAnimal t = new TestAnimal();
		t.func(new Animal());
		
		t.func(new Dog());
		t.func(new Cat());
			
	}
	public void func(Animal a){
		a.eat();
		a.jump();
		if(a instanceof Dog){
			Dog d = (Dog)a;
			d.wang();
		}
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchmouse();
		}
	}
}

class Animal{
	protected String name;
	protected int age;
	
	public void eat(){
		System.out.println("Animal eat");
	}
	public void jump(){
		System.out.println("Animal jump");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("dog eat");
	}
	public void jump(){
		System.out.println("dog jump");
	}
	public void wang(){
		System.out.println("wang wang");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("cat eat");
	}
	public void jump(){
		System.out.println("cat jump");
	}
	public void catchmouse(){
		System.out.println("cat catch mouse");
	}
}
