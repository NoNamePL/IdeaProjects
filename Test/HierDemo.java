// Подкласс может добавлять собственные параметры типов
class UnderGen<T> {
	T ob;
	
	// Передать конструктору ссылку на объект типа T
	UnderGen(T o) {
		ob = o;
	}
	
	// Возвратить ob
	T getOb() {
		return ob;
	}
}

// Подкласс Gen, определяющий второй параметр типа по имени V
class UnderGen2<T,V> extends UnderGen<T> {
	V ob2;
	
	
	UnderGen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	
	V getOb2() {
		return ob2;
	}
}	

// Создать объект типа UnderGen2
class HierDemo {
	public static void main(String[] args) {
		
		// создать объект UnderGen2 для String и Integer
		UnderGen2<String,Integer> x =
			new UnderGen2<String,Integer>("Значение: ", 89);
		
		System.out.print(x.getOb());
		System.out.println(x.getOb2());
	}
}