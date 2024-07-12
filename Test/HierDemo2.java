// Необобщенный класс может быть суперклассом обобщенного подкласса

// Необобщенный класс
class NonGen{
	int num;
	
	NonGen(int i) {
		num = i;
	}
	
	int getNum() {
		return num;
	}
}

// Обобщенный подкласс
class GenUnderAll<T> extends NonGen {
	T ob;
	
	// Передать конструктору ссылку на объект типа T
	GenUnderAll(T o, int i ) {
		super(i);
		ob = o;
	}
	
	// Возвратить ob
	T getOb() {
		return ob;
	}
	
}

class HierDemo2 {
	public static void main(String[] args) {
		
		// Создать объект GenUnderAll для String
		GenUnderAll<String> w = new GenUnderAll<String>("Добро пожаловать", 47);
		
		System.out.print(w.getOb() + " ");
		System.out.println(w.getNum());
	}
}