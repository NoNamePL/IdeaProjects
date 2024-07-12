class Exc2 {
	public static void main(String[] args) {
		int d,a;
		
		try { // Отслеживание блока кода
			d = 0;
			a = 42 / d;
			System.out.println("Это выводится не будет");
		} catch (ArithmeticException e) { // Перехватить ошибку деления на ноль
			System.out.println("Деление на ноль");
		}
		System.out.println("после оператьора catch");
	}
}