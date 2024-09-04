class StackApp {
	public static void main(String[] args) {
		StackX theStack = new StackX(10);				// Создани нового стека
		theStack.push(20);								// Занесение значений в стек
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		
		while(	!theStack.isEmpty()) {					// Пока стек не станет пуст 
			long value = theStack.pop();
			System.out.print(value);					// Вывод содержимого
			System.out.print(" ");
		}
		System.out.println("");
	}
}