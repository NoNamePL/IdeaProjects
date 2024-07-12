// Использование массива для передачи методу произвольного числа аргументов
// Этот подход в старом стиле к аргументам переменной длины
class PassArray {
	static void vaTest(int[] v) {
		System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
		for (int x : v) 
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Обратить внимание на то, как должен создаваться\
		// массив для хранения аргументов
		int[] n1 = { 10 };
		int[] n2 = {1, 2, 3};
		int[] n3 = { };
		
		vaTest(n1); // 1 аргумент
		vaTest(n2); // 3 аргумента
		vaTest(n3); // без аргументов
	}
}
