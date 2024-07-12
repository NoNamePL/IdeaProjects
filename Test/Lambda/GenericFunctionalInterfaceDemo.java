// Использование обобщенного функционального интерфейса с лямбда-выражениями

// Обобщенный функциональный интерфейс
interface SomeFunc<T> {
	T func(T t);
}

class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		// Использование версии String интерфейса SomeFunc
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length()-1;i >=0;i--) 
				result += str.charAt(i);
			return result;
		};
		
		System.out.println("Строка Lambda с противоположным порядком следования символов: " + reverse.func("Lambda"));
		System.out.println("Строка Expression с противоположным порядком следования символов: " + reverse.func("Expression"));
		
		// Теперь использовать версию Integer интерфейс SomeFunc
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n;i++) 
				result *= i;
			return result;
		};
		
		System.out.println("Факториал 3 равен: " + factorial.func(3));
		System.out.println("Факториал 5 равен: " + factorial.func(5));
	}
}