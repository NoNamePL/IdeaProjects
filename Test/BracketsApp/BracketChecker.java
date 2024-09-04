class BracketChecker {
	private String input;							// Входная строка
	
	public BracketChecker(String in) {				// Конструктор
		input = in;
	}
	
	public void check() {
		int stackSize = input.length();				// Определение размера стека
		StackX theStack = new StackX(stackSize);	// Создание стека
		
		for(int i=0;i<stackSize;i++) {				// Последовательное чтение
			char ch = input.charAt(i);				// Чтение символов
			switch(ch) {
				case '{':							// Открывающие стеки
				case '[':
				case '(':
					theStack.push(ch);				// Занесение скобки в стек
					break;
				case ']':
				case '}':
				case ')':
					if( !theStack.isEmpty()){		// Если стек не пуст
						char chx = theStack.pop();	// Извлечь символ и проверить
						if ((chx == ']' && chx != '[') ||
							(chx == ')' && chx != '(') ||
							(chx == '}' && chx != '{'))
							System.out.println("Error: " +ch+" at " + i);
					} else 							// Преждевременная нехватка элементов
						System.out.println("Error: " + ch+" at " + i);
					break;
				default:							// Для других символов действие не выполняется
					break;
			}	
		}
		
		// В этой точке обработаны все символы
		if (!theStack.isEmpty())
			System.out.println("Error: missing right delimeter");
	}
}