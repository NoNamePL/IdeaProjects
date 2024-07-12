// Использование блоков в операторах case со стрелкой
class BlockArrowCase { 
	public static void main(String[] args) {
		boolean stopNow;
		int eventCode = 9300;
		
		// Использовать блоки в операторах case со стрелкой. Снова
		// обратить внимание, что для предотвращения сквозного выполнения
		// оператор break не нужен (да и не разрешен)
		// Поскольку целью -> является блок, для предоставления значения
		// должен применяться оператор yield
		int priorityLeve = switch(eventCode) {
			case 1000, 1205, 8900 -> {
				stopNow = true;
				System.out.println("Тревога");
				yield 1;
			}
			case 2000, 6010, 9128 -> {
				stopNow = true;
				System.out.println("Предупреждение");
				yield 2;
			}
			case 1002, 7023, 9300 -> {
				stopNow = true;
				System.out.println("Опасность");
				yield 3;
			}
			default -> {
				stopNow = false;
				System.out.println("Все нормально");
				yield 0;
			}
		};
		System.out.println("Уровень приоритета для кода события "+ eventCode + " равен " + priorityLeve);
		if (stopNow) System.out.println("Требуется остановка.");
	}
}