// Использование встроенных методов перечисления
// Перечисление сортов яблок
enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
	public static void main(String[] args) {
		Apple ap;
		System.out.println("Все константы перечисления Apple:");
		
		// Использовать values()
		Apple[] allaples = Apple.values();
		for(Apple a : allaples)
			System.out.println(a);
		System.out.println();
		// Использовать valueOf()
		ap = Apple.valueOf("Winesap");
		System.out.println("ap содержит " + ap);
	}
}