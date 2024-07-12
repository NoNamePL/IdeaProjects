// В этой программе используется наследование для расширения класса Box

class Box {
	double width;
	double height;
	double depth;
	
	// Конструктор, применяемый для клонирования объекта
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// Конструктор, используемый в случае указания всех размеров
	Box(double w,double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// Конструктор, применяемый в случае, если размеры вообще не указаны
	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}
	
	// Конструктор, используемый в случае создания объекта кубической коробки
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return height * depth * width;
	}
}

// Здесь класс Box расширяется с целью включения члена weight
class BoxWeight extends Box {
	double weight; // вес коробки
	
	// Конструктор для BoxWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class ColorBox extends Box {
	int color;
	
	ColorBox(double w, double h, double d, int c) {
		width = w;
		height = h;
		depth = d;
		color = c;
	}
}

class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Объем mybox1 равен " + vol);
		System.out.println("Вес mybox1 равен " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Объем mybox2 равен " + vol);
		System.out.println("Вес mybox2 равен " + mybox2.weight);
		System.out.println();
		
	}
}