// Здесь в Box используется конструктор
// для инициализации размеров коробки

class Box {
	double width;
	double height;
	double depth;
	
	
	// Это конструктор для Box
	Box() {
			System.out.println("Конструрирование Box");
			width = 10;
			height = 10;
			depth = 10;
	}
	
	// Вычислить и возвратить объем
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo6 {
	public static void main(String[] args) {
		// Объявить, разместить в памяти и инициализировать объекты Box.
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		double vol;
		
		// Получить объем первой коробки
		vol = mybox1.volume();
		System.out.println("Объем равен " + vol);
	
		// Получить объем второй коробки
		vol = mybox2.volume();
		System.out.println("Объем равен " + vol);
	}
}