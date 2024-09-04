
class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max){						// Конструктор 
		a = new long[max];							// Создание массива
		nElems = 0;									// Указание количества элементов
	}
	
	public void insert(long value) {						// Вставка элемента в массив
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {							// Отображение всех элементов
		for (int i=0;i<nElems;i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public void bubleSort() {						// Сортировка пузырьком
		int out, in;
		for(out=nElems-1;out>1;out--)				// Внешний цикл(обратный)
			for(in=0;in<out;in++)					// Внутренний цикл(прямой)
				if(a[in] > a[in+1])
					swap(in,in+1);					// Поменять местами
	}
	
	public void bubleReverseSort() {
		int out, in,min,lefBoard;
		lefBoard=0;
		for(out=nElems-1;out>1;out--)
			for(in=0;in<out;in++)
				if(a[in]>a[in+1])
					swap(in,in+1);
			for(min=out;min>lefBoard;min--)
				if(a[min]<a[min-1])
					swap(min,min-1);
			lefBoard++;
	}
	
	public void swap(int one, int two) {					// Премещение двух элементов в списке
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}