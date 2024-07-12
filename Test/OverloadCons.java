// Здесьв классе Box определены три конструктора для инициализации
// размеров объекта коробки различными способами
class Box {
	double width;
	double height;
	double depth;
	
	// Конструктор, используемый в случае, указания всех размеров
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// Конструктор, используемый в случае, если размеры вообще не указаны
	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}
	
	// Конструктор, используемый в случае создания объекта кубика
	Box(double len) {
		width = height = depth = len;
	}
	
	// Вычислить и возвратить объем 
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons {
	public static void main(String[] args) {
		// Создание объектов коробок с применением различных конструкторов
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		double vol;
		
		// Вычислить объем первой коробки
		vol = mybox1.volume();
		System.out.println("Объем mybox1 равен " + vol);
		
		// Вычислить объем второй коробки
		vol = mybox2.volume();
		System.out.println("Объем mybox2 равен " + vol);
		
		// Вычислить объем кубика
		vol = mycube.volume();
		System.out.println("Объем mycube равен " + vol);
	}
}