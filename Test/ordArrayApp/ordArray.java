// Работа с классом упорядочного массива
///////////////////////////////////////
class ordArray{
	private long[] ar; 					// Ссылка на массив
	private int nElems;					// Количество элементов данных

	public ordArray(int max) {			// Конструктор с указанием максимального размера массива
		ar = new long[max];
		nElems = 0;
	}

	public int size() {					// Возвращает текущее количество элементов в массиве
		return nElems;
	}

	// метод двоичного поиска
	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;

		while(true) {
			curIn = (lowerBound + upperBound) / 2;
			if (ar[curIn]==searchKey)
				return curIn;			// Элемент найден
			else if ( lowerBound > upperBound)
				return nElems;			// Элемент не найден и возвращается количество элементов в массиве
			else {						// Деление диапозона поиска
				if(ar[curIn] < searchKey)
					lowerBound = curIn + 1;	// Значение в верхней половине
				else
					upperBound = curIn - 1;	// Значение в нижней половине
			}
		}
	}

	// Вставка элемента в массив
	public void insert(long value) {
		//int j;
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;

		while(true) {

			curIn = (lowerBound + upperBound) / 2;

			if(ar[curIn] < value && value < ar[curIn] && ar[curIn+1] != 0)
				break;
			if(lowerBound > upperBound)
				break;
			if(ar[curIn] < value ) {
                lowerBound = curIn+1;
				if ((ar[curIn+1] > value && ar[curIn+1] != 0) || nElems < 2)
					break;
			} else
                upperBound = curIn-1;
		}
		long tempVal = ar[curIn];
		long secondVal = ar[curIn+1];

		for(int k=curIn;k<nElems;k++) {
			ar[k + 1] = tempVal;
			tempVal = secondVal;
		}
		ar[curIn] = value;
		nElems++;
		/*
		for(j=0;j<nElems;j++) 				// Определение позиции вставки
			if(ar[j] > value)				// Линейный поиск
				break;
		for(int k=nElems;k>j;k--)			// Перемещение последующих элементов
			ar[k] = ar[k-1];
		ar[j] = value;						// Вставка
		nElems++;							// Увеличение размера
		*/
	}
	
	// Удаление элемента из массива
	public boolean delete(long value) {
		int j = find(value);
		if (j == nElems)					// Найти элемент не удалось
			return false;
		for(int k=j;k<nElems;k++)			// Перемещение последующих элементов
			ar[k] = ar[k+1];
		nElems--;							// Уменьшение размера
		return true;
	}
	
	public void display() { 				// Вывод содержимого массив
		for(int j=0; j<nElems;j++)			// Перебор всех значений
			System.out.print(ar[j] + " ");	// Вывод элемента
		System.out.println("");
	}
}