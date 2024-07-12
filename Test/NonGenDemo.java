// Класс NoGen функционально эквивалентен Gen,
// Но не задействует обобщение
class NonGen {
	Object ob; // ob теперь имеет ссылку на Object
	
	// Передать конструктору ссылку на объект типа Object
	NonGen(Object o) {
		ob = o;
	}
	
	// Возвратить объект типа Object
	Object getOb() {
		return ob;
	}
	
	// Вывести тип ob
	void showType() {
		System.out.println("Типом является: " + ob.getClass().getName());
	}
}

class NonGenDemo {
	public static void main(String[] args) {
		NonGen iOb;
		
		// Создать экземпляр NonGen и сохранить в нем объект integer
		// Автоупаковка по прежнему происходит
		iOb = new NonGen(88);
		
		// вывести тип данных, использумых переменной iOb
		iOb.showType();
		
		// Получить значение iOb. на этот раз приведение обязательно
		int v = (Integer) iOb.getOb();
		System.out.println("Значение: " + v);
	}
}