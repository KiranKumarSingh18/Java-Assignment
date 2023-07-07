// Rectangle, Triangle - 9

class Shape{
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 20;
		System.out.println(r.area());
		System.out.println(r.perimeter());

		Triangle t = new Triangle();
		t.base=10;
		t.height = 20;
		System.out.println(t.area());
	}
}
 class Rectangle{

	double length;
	double breadth;

	public double area(){
		return length*breadth;
	}
	
	public double perimeter(){
		return 2 * length * breadth;
	}
}
class Triangle{

	double base;
	double height;

	public double area(){
		return (base*height)/2;
	}
}
