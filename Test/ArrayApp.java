// Работа с массивами в java
//////////////////////////////////
class ArrayApp {
	public static void main(String[] args) {
		long[] arr;				// ссылка на массив 
		arr = new long[100];	// создани массива
		int nElems = 0;			// количество элементов
		int j;					// счетчик цикла
		long searchKey;			// ключи искомого элемента
		
		arr[0] = 77;			// Вставка 10 элементов
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;			// массив содержит 10 элементов
		
		for(j=0;j < nElems;j++) // вывод элементов
			System.out.print(arr[j] + " ");
		System.out.println("");
		
		searchKey = 66;			// поиск элемента с ключом 66
		for(j=0;j<nElems;j++)	// для каждого элемента
			if(arr[j] == searchKey) // значение найдено?
				break;				// если да, то выход из цикла
		if(j==nElems) 				// Достигнут последний элемент,
			System.out.println("Can't find " +searchKey); // да
		else
			System.out.println("Found " + searchKey); // нет
		
		///////////////////////////////////
		searchKey = 55;				// Удаление элемента с ключом 55
		for(j=0;j<nElems;j++)		// Поиск удалаяемого элемента
			if(arr[j] == searchKey)
				break;
		for (int k=j;k<nElems-1;k++)	// сдвиг последующих элементов
			arr[k] = arr[k+1];
		nElems--;					// уменьшение размера
		//////////////////////////////////
		for(j=0;j<nElems;j++)
			System.out.print(arr[j]+" ");
		System.out.println("");
		
		System.out.println(" ");
		System.out.println(arr[8]);
		
	}
}