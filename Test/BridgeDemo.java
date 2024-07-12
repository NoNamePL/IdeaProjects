// Ситуация, в которой создается мостовой метод
class BridgeGen<T> {
	T ob;
	
	// Передать конструктору ссылку на объект T
	BridgeGen(T o) {
		ob = o;
	}
	
	// Возвратить ob
	T getOb() {
		return ob;
	}
}

// Подкласс BridgeGeen
class BridgeGen2 extends BridgeGen<String> {
	
	BridgeGen2(String o){
		super(o);
	}
	
	// Переопределенная версия getOb(), специфичная для String
	String getOb() {
		System.out.print("Вывзван метод getOb(), специфичный для String: ");
		return ob;
	}
}

// Демонстрация ситуации, когда требуется мостовой метод
class BridgeDemo {
	public static void main(String[] args) {
		// создать объект BridgeGen2 для String
		var strOb2 = new BridgeGen2("Текст обобщений");
		
		System.out.println(strOb2.getOb());
		
	}
}