class Queue {
	private int maxSize;
	private long[] queArray;
	private int font;					// Первый в очереди
	private int rear;					// Последний в очереди
	private int nItems;					// Количество элементов в очереди
	
	// Конструктор
	public Queue(int max) {
		maxSize = max;
		queArray = new long[maxSize];
		font = 0;
		rear = -1;
		nItems = 0;
	}
	
	// Вставка элемента в конце очереди
	public void insert(long j) {
		if(rear==maxSize-1)				// Циклический перенос
			rear = -1;
		queArray[++rear] = j;			// Увеличение rear и вставка
		nItems++;						// Увеличение количество элементов
	}
	
	// Извлечение элемента в начале очереди
	public long remove(){
		
		if (nItems==0) {
			throw new Exception("Empty Queue");
		}
		
		long temp = queArray[font++];	// Выборка и увеличенеи font
		if(font == maxSize)				// Циклический перенос
			font = 0;
		nItems--;						// Уменьшение количества элементов
		return temp;
	}
	
	// Чтение элемента в начале очереди
	public long peekFont() {
		return queArray[font];
	}
	
	// True, если очередь пустая
	public boolean isEmpty() {
		return(nItems==0);
	}
	
	// True, если очередь полная
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	// Количество элементов в очереди
	public int size() {
		return nItems;
	}
	
}