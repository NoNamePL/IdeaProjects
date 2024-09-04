// Элементы массива сортируются по значению ключа
// от максимума (0) до минимума maxSize-1
class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public PriorityQ(int max) {
		maxSize = max;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long item) {					// Вставка элемента
		int j;
		
		if(nItems==0)								// Если очередь пуста
			queArray[nItems++] = item;				// Вставить элемент в 0
		else {										// Если очередь содержит элементы
			
			for(j=nItems-1;j>=0;j--) {				// Перебор в обратном направлении
				
				if(item>queArray[j])				// Если новый элемент больше
					queArray[j+1] = queArray[j];	// Сдвинуть наверх
				else break;
			}
			queArray[j+1] = item;					// Вставка элемента
			nItems++;
		}
	}
	
	public long remove() {							// Извлечение минимального элемента
		return queArray[--nItems];
	}
	
	public long peekMin() {							// Чтение минимального элемента
		return queArray[nItems-1];
	}
	
	public boolean isEmpty() {						// True, если очередь пустая
		return (nItems==0);
	}
	
	public boolean isFull() {						// True, если очередь полная
		return (nItems==maxSize);
	}
	
	
}