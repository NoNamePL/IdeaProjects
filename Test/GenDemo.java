// Простой обобщенный класс
// Здесь T - параметр типа, который будет заменен
// реальным типом при создания объекта типа Gen
class Gen<T> {
	T ob; // Объявить объект типа 
	// Передать конструктору ссылку на объект типа T
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	// Вывести тип T
	void showType() {
		System.out.println("Типом T является " + ob.getClass().getName());
	}
}

class GenDemo {
	public static void main(String[] args) {
		// создать объект Gen для объектов типа Integer
		Gen<Integer> iOb;
		
		// Создать объект Gen<Integer> и присвоить ссылку на него
		// переменной iOb. Обратить внимание на использование автоупаковки
		// для инкапсуляции значения 88 внутри объекта Integer
		iOb = new Gen<Integer>(88);
		
		// Вывести тип данных, используемых переменной iOb
		iOb.showType();
		
		// Получить значение iOb. Обратить внимание
		// что приведение не требуется
		
		int v = iOb.getOb();
		System.out.println("Значение: " + v);
		System.out.println();
		
		// Создание объекта Gen для объектов типа String 
		Gen<String> strOb = new Gen<String>("Текст обобщениями");
		
		// Вывести тип данных, используемых переменной strOb
		strOb.showType();
		
		// Получить значение strOb. Снова обратить внимание
		// что приведение не требуется
		String str = strOb.getOb();
		System.out.println("Значение: " + str);
	}
}