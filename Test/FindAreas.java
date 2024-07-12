// Использование полиморфизма во время выполнения 
// Использование абстрактных методов и классов
 abstract class Figure {
	double dim1;
	double dim2;
	
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a,b);
	}
	
	double area() {
		System.out.println("Внутри Area() для Rectangle");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a,b);
	}
	
	double area() {
		System.out.println("Внутри area() для Triangle");
		return dim1*dim2/2;
	}
}

class FindAreas {
	public static void main(String[] args) {
		//Figure f = new Figure(10, 10); Недопустипо, потому что класс - абстрактный
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure figuref;
		
		figuref = r;
		System.out.println("Площадь равна " + figuref.area());
		figuref = t;
		System.out.println("Площадь равна " + figuref.area());
	}
}