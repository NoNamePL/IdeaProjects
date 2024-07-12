// Законченнаяы реализация класса BoxWeight
class Box {
	private double width;
	private double height;
	private double depth;
	
	// Конструктор, применяемый для клонирования объекта
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob. depth;
	}
	
	// Конструктор, используемый в случае указания всех размеров
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// Конструктор, применяемый в случае, если размер вообще не указания
	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}
	
	// Конструктор, используемый в случае создания объекта
	// кубической коробки
	Box(double len) {
		width = height = depth = len;
	}
	
	// Вычислить и возвратить объем
	double volume() {
		return height * width * depth;
	}
}

// Теперь класс BoxWeight польностью реализует все конструкторы
class BoxWeight extends Box{
	double weight; // Вес коробки
	
	// Конструктор, применяемый для клонирования объекта
	BoxWeight(BoxWeight ob) { // передать объект конструктору
		super(ob);
		weight = ob.weight;
	}
	
	// Конструктор, используемый в случае указания всех параметров.
	BoxWeight(double w, double h, double d, double m) {
		super(w,h,d);
		weight = m;
	}
	
	// Стандартный конструктор
	BoxWeight() {
		super();
		weight = 0;
	}
	
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class DemoSuper {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight(); // стандартный
		BoxWeight mycube = new BoxWeight(3,2);
		BoxWeight myclone = new BoxWeight(mybox1);
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Объем mybox1 равен " + vol);
		System.out.println("Вес mybox1 равен " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Объем mybox2 равен " + vol);
		System.out.println("Вес mybox2 равен " + mybox2.weight);
		System.out.println();
		
		vol = mybox3.volume();
		System.out.println("Объем mybox3 равен " + vol);
		System.out.println("Вес mybox3 равен " + mybox3.weight);
		System.out.println();
		
		vol = mycube.volume();
		System.out.println("Объем mycube равен " + vol);
		System.out.println("Вес mycube равен " + mycube.weight);
		System.out.println();
		
		vol = myclone.volume();
		System.out.println("Объем myclone равен " + vol);
		System.out.println("Вес myclone равен " + myclone.weight);
		System.out.println();
	}
}