// Демонстрация использования аргументов переменной длины
class VarArgs {
	// varTest() now uses a vararg
	static void vaTest(int ... v) {
		System.out.println("Количество аргументов: " + v.length + " Содержимое: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Обратить внимание, что теперь метод vaTest()
		// можно вызывать с переменным числом аргументов
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}