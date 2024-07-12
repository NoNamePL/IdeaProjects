// Определить интерфейс для целочисленного стека
interface IntStack {
	void push(int item); // Сохранить элемент
	int pop(); // извлечь элемент
	
	// Стандартный метод, возвращает массив, который
	// содержит верзние n элементов в стеке
	default int[] popNElements(int n) {
		// возвратить запрошенный элемент
		return getElements(n);
	}
	
	// Стандартный метод, возвращает массив, который содержит
	// следующие n элементов в стеке после пропуска skip элементов
	default int[] skipAndPopNElements(int skip, int n) {
		
		// Пропустить указанное количество элементов
		getElements(skip);
		
		// возвратить запрошенные элементы
		return getElements(n);
	}
	
	// Закрытый метод, который возвращает массив, содержащий
	// верхние n элементы в стеке
	private int[] getElements(int n) {
		int[] elements = new int[n];
		
		for(int i = 0;i < n;i++) elements[i] = pop();
		return elements;
	}
	
	// Поскольку метод clear() имеет стандартную реализацию, его не нужно
	// реализовывать в существующем классе, использующий IntStack
	default void clear() {
		System.out.println("Метод clear() не реализован");
	}
	
	
}