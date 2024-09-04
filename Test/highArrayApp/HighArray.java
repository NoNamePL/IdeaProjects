// Класс массива с высокоуровневым интерфейсом
////////////////////////////////
class HighArray{
	private long[] arr; // Ссыка на массив 
	private int nElems; // Количество элементов в массиве
	
	public HighArray(int max)	// Конструктор
	{
		arr = new long[max];	// Создание массива
		nElems = 0;				// Пока нет ни одного элемента
	}
	
	public boolean find(long searchKey)
	{					// Поиск заданного значения
	int j;
	for(j=0;j<nElems;j++)		// Для каждого элемента
		if(arr[j] == searchKey)	// Значение найдено?
			break;				// Да - выход из цикла
		if(j==nElems)			//Достигнут последний элемент
			return false;		// Да
		else
			return true;		//Нет
	}
	//-------------------------------------------------------------
	public void insert(long value)	// Вставка элемента в массив
	{
		arr[nElems] = value; // Собственно вставка
		nElems++;			 // Увеличение размера
	}
	
	//------------------------------------------------------------
	public boolean delete(long value)
	{
		int j;
		for(j=0;j<nElems;j++)		// Поиск заданного значения
			if(value == arr[j])
				break;
			if(j==nElems)			// Найти не удалось
				return false;
			else					// Значение найдено
			{
				for(int k=j;k<nElems;k++) //Сдвиг последующих элементов
					arr[k] = arr[k+1];
				nElems--;				// Уменьшение сдвига
				return true;
			}
	}
		
	public void display() 			// Вывод содержимого массива
	{
		for(int i=0;i<nElems;i++) // Для каждого элемента
				System.out.print(arr[i]+" ");
			System.out.println("");
	}
	
	public long getMax()			// Вывод максимальное значение ключа или -1
	{
		int j;
		long tempMax = -1;
		for(j=0;j < nElems;j++) {	// Проход по всем элементам
			if(arr[j] > tempMax) {
				tempMax = arr[j];
			}
		}
		
		return tempMax;
	}
	
	public long removeMax()			// Вывод максимального значения ключа или -1, после этого элемент удаляется
	{
		long maxValue = getMax();
		delete(maxValue);
		return maxValue;
	}
	
	public int getSize()			// Получить текущий размер массива
	{
		return nElems;
	}
}