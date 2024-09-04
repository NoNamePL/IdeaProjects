class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int max) {
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {								// Размещение элемента на вершине стека
		stackArray[++top] = j;
	}
	
	public char pop() {										// Извлечение элемента с вершины стека
		return stackArray[top--];
	}
	
	public char peek() {									// Чтение элемента с вершины стека
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==maxSize);
	}
	
}