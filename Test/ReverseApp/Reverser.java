class Reverser {
	private String input;							// Входная строка
	private String output;							// Выходная строка
	
	public Reverser(String in) {					// Конструктор
		input = in;
	}
	
	public String doRev() {							// Перестановка символов
		int stackSize = input.length();				// Определение размера стека
		StackX theStack = new StackX(stackSize);	// Создание стека
		
		for(int j=0;j<stackSize;j++){
			char ch = input.charAt(j);				// Чтение символов из входного потока
			theStack.push(ch);						// Запись в стек
		}
		
		output = "";
		while( !theStack.isEmpty()) {
			char ch = theStack.pop();				// Извлечение символа из стека
			output = output + ch;					// Присоединение к выходной строке
		}
		
		return output;
	}
	
}