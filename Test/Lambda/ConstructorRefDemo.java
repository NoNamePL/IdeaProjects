// Демонстрация использования ссылки на конструктор

// MyFuncConst - функциональный интерфейс, метод которого
// возвращает ссылку на конструктор MyConstClass
interface MyFuncConst {
	MyConstClass func(int n);
}

class MyConstClass {
	private int val;
	
	// Конструктор, принимающий аргумент
	MyConstClass(int v) {val = v;}
	
	// Стандартный конструктор
	MyConstClass() { val = 0;}
	
	// ..
	int getVal() { return val;}
}

class ConstructorRefDemo {
	public static void main(String[] args) {
		// Создать ссылку на конструктор MyConstClass
		// Поскольку метод func() в MyFuncConst принимает аргумент, new ссылается
		// на параметризованный конструктор MyConstClass, а не на стандартный
		MyFuncConst myClassCons = MyConstClass::new;
		
		// Создать экземпляр MyConstClass через эту ссылку на конструктор
		MyConstClass mc = myClassCons.func(100);
		
		// Исползовать только что созданный экземпляр MyConstClass
		System.out.println("val в mc равно " + mc.getVal());
	}
}