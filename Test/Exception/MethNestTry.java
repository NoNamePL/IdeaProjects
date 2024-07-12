// Оератор try могут быть неявно вложенными через вызов метода
class MethNestTry {
	static void nesttry(int a) {
		try { // вложенный блок try
			if(a==1) a = a/(a-a); // деление на ноль
			
			if (a==2) {
				int[] c = {1};
				c[42] = 99;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Выход за допустимые пределы индекса в массиве: " + e);
		}
	}
	
	public static void main(String[] args) {
		try {
			int a = args.length;
			
			// если аргумент отсутствует, то 
			// исключение деление на ноль
			int b = 42/a;
			System.out.println("a = " + a);
			nesttry(a);
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль: " + e);
		}
	}
}