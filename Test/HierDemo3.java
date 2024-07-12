// Использование операции instanceof с иерархией обобщенных классов 
class instancGen<T> {
	T ob;
	instancGen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
}

// Подкласс instancGen
class instancGen2<T> extends instancGen {
	instancGen2(T o) {
		super(o);
	}
}

// Демонстрация последствий идентификации типов во время
// выполнения для иерархии обобщенных классов 
class HierDemo3 {
	public static void main(String[] args){
		
		// Создать объект instancGen для Integer
		instancGen<Integer> iob = new instancGen<Integer>(88);
		
		// Создать объект instancGen2 для Integer
		instancGen2<Integer> iob2 = new instancGen2<Integer>(99);
		
		// Создать объект instancGen2 для String
		instancGen2<String> strob2 = new instancGen2<String>("Текст обобщений");
		
		if(iob2 instanceof instancGen2<?>)
			System.out.println("iob2 - экземпляр instancGen2");
		
		// Выяснить, является ли iob2 како-то формой instancGen
		if(iob2 instanceof instancGen<?>)
			System.out.println("iob2 - экземпляр instancGen");
		
		System.out.println();
		
		// Выяснить, является ли iob экземпляром instancGen2, что не так
		if(iob instanceof instancGen2<?>)
			System.out.println("iob - экземпляр instancGen");
		
		// Выяснить, является ли iob экземпляр instancGen, что так
		if (iob instanceof instancGen<?>)
			System.out.println("iob- экземпляр instancGen");
	}
}