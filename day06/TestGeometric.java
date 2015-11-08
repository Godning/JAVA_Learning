package day08;

public class TestGeometric {
	public static void main(String[] args) {
		TestGeometric t = new TestGeometric();
		
		Circle c1 = new Circle(2.3, "Green", 1.0);
		Circle c2 = new Circle(2.3, "Red", 1.0);
		
		MyRectangle m1 =new MyRectangle(2.3, 3.0, "bule", 2.0);
		
		t.displayGeometricObject(c1);
		t.displayGeometricObject(c2);
		t.displayGeometricObject(m1);
		
		System.out.println(t.equalArea(c1, c2));
	}
	
	public boolean equalArea(GeometricObject a,GeometricObject b){
		return a.findArea() == b.findArea();
	}
	public void displayGeometricObject(GeometricObject o){
		System.out.println(o.findArea());
	}
}
