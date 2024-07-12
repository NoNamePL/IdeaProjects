public interface MyIf {
	// Это объявление "нормального" метода интерфейса
	// в нем Не определяется стандартная реализация
	int getNumber();
	// Это стандартный метод. Обрати внимания,
	//  что он предоставляет реализацию по умолчанию
	default String getString() {
		return "Стандартная строка";
	}
	
	static int getDefaultNumber() {
		return 0;
	}
}	
