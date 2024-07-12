// Переопределить обобщенного метода в обобщенном классе
class OverrideGen<T> {
	T ob;
	
	// Передать конструктору ссылку на объект типа T
	OverrideGen(T o) {
		ob = o;
	}
	
	// Возвратить ob
	T getOb() {
		System.out.print("getOb() в Gen: ");
		return ob;
	}
}

// Подкласс OverrideGen, в котором переопределяется getOb()
class OverrideGen2<T> extends OverrideGen<T> {
	OverrideGen2(T o) {
		super(o);
	}
	
	// переопделение getOb
	T getOb() {
		System.out.print("getOb() в Gen2: ");
		return ob;
	}
}

class OverrideHierDemo {
	public static void main(String[] args) {
		
		// Создать объект OverrideGen для Integer
		OverrideGen<Integer> iOb = new OverrideGen<Integer>(88);
		
		// Создать объект OverrideGen2 для Integer
		OverrideGen2<Integer> iOb2 = new OverrideGen2<Integer>(99);
		
		// Создать объект OverrideGen2 для String
		OverrideGen2<String> strOb2 = new OverrideGen2<String>("Текст обобщений");
		
		System.out.println(iOb.getOb());
		System.out.println(iOb2.getOb());
		System.out.println(strOb2.getOb());
		
	}
}