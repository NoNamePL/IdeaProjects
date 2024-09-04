// Основное приложение. Реализация структуры данных "массив" из отдельного класса
class LowArrayApp {
	public static void main(String[] args) {
		LowArray arr;				// Ссылка
		arr = new LowArray(100);	// Создание объекта LowArr
		int nElemnt = 0;			// Количество элементов в массиве
		int j;						// Переменная цикла
		
		arr.setElem(0,77);			// Вставка 10 элементов
		arr.setElem(1,99);
		arr.setElem(2,44);
		arr.setElem(3,55);
		arr.setElem(4,22);
		arr.setElem(5,88);
		arr.setElem(6,11);
		arr.setElem(7,00);
		arr.setElem(8,66);
		arr.setElem(9,33);
		nElemnt = 10;				// Массив содержит 10 элементов
		
		for(j=0;j<nElemnt;j++)		// Вывод элементов
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
		
		int searchKey = 26;			// Поиск элементов
		for(j=0;j<nElemnt;j++)		// Для каждого элемента
			if(arr.getElem(j) == searchKey) // Значение найдено?
				break;
		if(j==nElemnt)			// Нет
			System.out.println("Can't find " + searchKey);
		else					// Да
			System.out.println("Found " + searchKey);
		
		// Удаление элемента с ключом 55
		for(j=0;j<nElemnt;j++)		// Поиск удаляемого элемента
			if(arr.getElem(j) == 55)
				break;
		for(int k=j;k<nElemnt;k++)	// Сдвиг последующих элементов
			arr.setElem(k,arr.getElem(k+1));
		nElemnt--;					// Уменьшение размера
		
		for(j=0;j<nElemnt;j++) // Вывод содержимого
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
	}
}