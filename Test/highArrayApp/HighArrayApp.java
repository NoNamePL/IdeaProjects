class HighArrayApp{
	public static void main(String[] args) {
		int maxSize = 100;	// Размер массива
		HighArray arr;		// Ссылка на массив
		
		arr = new HighArray(maxSize);	// Создаине массива
		
		arr.insert(77);				// Вставка 10 элементов
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();		// Вывод элементов
		
		int searchKey = 35;		// Поиск элементов
		if(arr.find(searchKey))
			System.out.println("Found " + searchKey);
		else 
			System.out.println("Can't find " + searchKey);
		
		arr.delete(00);			// Удаление трех элементов
		arr.delete(55);
		arr.delete(99);
		
		arr.display();
		
		long maxValue = arr.getMax();
		System.out.println("Max value in massive: " + maxValue);
		
		
		System.out.println("Delete max value in array: " + arr.removeMax());				// Удаление максимального значения
		
		arr.display();
		
		System.out.println("");
		/*
		// Реализация алгоритма сортировки с использованием removeMax
		int orderedSize = arr.getSize();
		long[] orderedMass = new long[orderedSize];
		
		for(int i = orderedSize-1; i > 0;i--) { 								// Алгоритм сортировки(мой алг)
			orderedMass[i] = arr.removeMax();
		}
		
		for(int i = 0; i < orderedSize;i++)
			System.out.print(orderedMass[i] + " ");
		
		*/
		/*
		// Реализация алгоритма сортировки с использованием removeMax для массива HighArray
		int orderedSize = arr.getSize();
		HighArray orderedMassHigh = new HighArray(orderedSize);
		
		for(int i = orderedSize-1; i > 0; i--)
			orderedMassHigh.insert(arr.removeMax());
		
		orderedMassHigh.display();
		
		*/
		
	}
}