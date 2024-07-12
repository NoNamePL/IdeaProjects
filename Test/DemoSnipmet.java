// расширение класса BoxWeight с целью включения стоимости доставки
class Box {
	private double width;
	private double height; 
	private double depth;
	
	// Конструктор, применяемый для клонирования объекта
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxWeight extends Box {
	double weight;
	
	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight(double w, double h, double d, double m) {
		super(w,h,d);
		weight = m;
	}
	
	BoxWeight() {
		super();
		weight = 0;
	}
	
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class Snipmet extends BoxWeight {
	double cost;
	
	Snipmet(Snipmet ob) {
		super(ob);
		cost = ob.cost;
	}
	
	Snipmet(double w,double h, double d, double m, double c) {
		super(w,h,d,m);
		cost = c;
	}
	
	
	Snipmet() {
		super();
		cost = 0;
	}
	
	Snipmet(double len, double m, double c) {
		super(len,m);
		cost = c;
	}
}

class DemoSnipmet {
	public static void main(String[] args) {
		Snipmet snipment1 = new Snipmet(10, 20, 15, 10, 3.41);
		Snipmet snipment2 = new Snipmet(2, 3, 4, 0.76, 1.28);
		
		double vol;
		
		vol = snipment1.volume();
		System.out.println("Объем snipment1 равен " + vol);
		System.out.println("Вес snipment1 равен " + snipment1.weight);
		System.out.println("Стоимость доставки: $" + snipment1.cost);
		
		vol = snipment2.volume();
		System.out.println("Объем snipment2 равен " + vol);
		System.out.println("Вес snipment2 равен " + snipment2.weight);
		System.out.println("Стоимость доставки: $" + snipment2.cost);
	}
}