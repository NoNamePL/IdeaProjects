class Box {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.print("Объем равен ");
		System.out.println(width * height * depth);
	}
}

// В этом классе объявляется объект типа Box
class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// Присвоить значения переменным экземпляра
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// Присвоить переменным экземпляра mybox2 другие значения
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// Отобразить объем первой коробки
		mybox1.volume();
		// Отобразить объем второй коробки
		mybox2.volume();
		
	}
}