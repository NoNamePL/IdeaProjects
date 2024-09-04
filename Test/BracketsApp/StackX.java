// Использование стека для поиска парных скобок
class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int max) {
		maxSize = max;
		stackArray = new char[maxSize];
		top=-1;
	}
	
	public void push(char ch) {							// Размещение элемента на вершине стека
		stackArray[++top] = ch;
	}
	
	public char pop() {									// Извлечение элемента из стека и его удаление
		return stackArray[top--];
	}
	
	public char peek() {								// Просто извлечение  элемента из стека
		return stackArray[top];
	}
	
	public boolean isEmpty(){							// Пустой ли стек
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==maxSize);
	}
}