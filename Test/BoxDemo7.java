/* 
 Здесь в Box используется параметризованный конструктор
 для инициализации размеров коробки
*/

class Box {
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = h;
	}
	
	// Вычислить и возвратить объем
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo7 {
	public static void main(String[] args) {
		// Объявить, разместить в памяти и инициализировать объекты Box.
		Box myboxl = new Box( 10, 20, 15 ) ;
		Box mybox2 = new Box(3, 6, 9);
		
		double vol;
		
		// Получить объем первой коробки
		vol = myboxl.volume();
		System.out.println("Объем коробки " + vol);
		
		// Получить объем второй коробки
		vol = mybox2.volume();
		System.out.println("Объем коробки " + vol);
	}
}