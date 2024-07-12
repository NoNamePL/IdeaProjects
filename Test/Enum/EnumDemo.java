// Перечисление сортов яблок
enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
	
	class EnumDemo {
		public static void main(String[] args) {
			Apple ap;
			ap = Apple.RedDel;
			// Вывести значение перечисления
			System.out.println("Значение ap: " + ap);
			System.out.println();
			ap = Apple.GoldenDel;
			// сравнить два значения
			if(ap==Apple.GoldenDel)
				System.out.println("ap содержит GoldenDel.\n");
			// Использовать перечисление для управления оператором switch
			switch(ap) {
				case Jonathan:
					System.out.println("Яблоки сорта Джонатан (Jonathan) имеют красный цвет");
					break;
				case GoldenDel:
					System.out.println("Яблоки сорта Голден делишс (GoldenDel) имеют желтый цвет");
					break;
				case RedDel:
					System.out.println("Яблоки сорта Ред делишс (RedDel) имеют красный цвет");
					break;
				case Winesap:
					System.out.println("Яблоки сорта Вайнсап (Winesap) имеют красный цвет");
					break;
				case Cortland:
					System.out.println("Яблоки сорта Кортланд (Cortland) имеют красный цвет");
					break;
			}
		}
	}