package day06;

class Circle {
	double radius;

	public void setRadius(double r) {
		radius = r;
	}

	public double getRaduis() {
		return radius;
	}

	public double findArea() {
		return radius * radius * Math.PI;
	}
}

public class PassObject {
	public static void main(String[] args) {
		PassObject p = new PassObject();
		Circle c = new Circle();
		p.printAreas(c, 5);
		
		System.out.println("now radius is "+ c.getRaduis());
		
		System.out.println(p.getSum(1,2,3,4,5,6,7));
	}

	public void printAreas(Circle c, int time) {
		System.out.println("Radius\t\t" + "Area");
		for (int i = 1; i <= time; i++) {
			c.setRadius(i);
			System.out.println(c.getRaduis()+"\t\t"+c.findArea());
		}
	}
	
	public int getSum(int ... args){
		int sum = 0;
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}
}
