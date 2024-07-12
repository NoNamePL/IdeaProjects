// Преобразования оператора switch в выраженеи switch
class SwitchExp {
	public static void main(String[] args) {
		int evenCode = 6010;
		
		// Это выражение switch. Обратить внимание на то, как его значение
		// присваивается переменной priorityLevel, а также на то,
		// что значение switch предоставляется оператором yield
		int priorityLevel = switch(evenCode) {
			case 1000,1205, 8900:
				yield 1;
			case 2000, 6010, 9128:
				yield 2;
			case 1002, 7023, 9300:
				yield 3;
			default:
				yield 0;
		};
		System.out.println("Уровень приоритета для кода события " + evenCode + " равен " + priorityLevel);
	}
}