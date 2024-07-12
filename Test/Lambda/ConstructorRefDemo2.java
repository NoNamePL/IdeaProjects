
// Демонстрация использования ссылки на конструктор обобщенного класса

// Теперь MyFuncConst2 - Обобщенный функциональный интерфейс
interface MyFuncConst2<T> {
	MyConstClass2<T> func(T n);
}

class MyConstClass2<T> {
	private T val;
	
	// Конструткор, принимающий аргумент
	MyConstClass2(T v) {val = v;}
	
	// Стандартый конструктор
	MyConstClass2() {val = null;}
	
	T getVal() { return val;}
}


class ConstructorRefDemo2 {
	public static void main(String[] args) {
		// Создать ссылку на конструктор MyConstClass2<T>
		MyFuncConst2<Integer> myClassCons = MyConstClass2<Integer>::new;
		
		// Создать экземпляр класса MyConstClass2<T> через эту ссылку на конструктор
		MyConstClass2<Integer> mc = myClassCons.func(100);
		
		// Использовать только что созданный экземпляр MyConstClass2
		System.out.println("val в mc равно " + mc.getVal());
	}
}