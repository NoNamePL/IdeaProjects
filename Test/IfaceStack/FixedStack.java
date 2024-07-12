// Реализация IntStack, использующая хранилище фиксированной длинны
class FixedStack implements IntStack {
	private int[] stck;
	private int tos;
	
	// Реализовать в памяти и инициализировать стек
	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}
	// Поместить элемент в стек
	public void push(int item) {
		if(tos==stck.length-1)
			System.out.println("Стек полон");
		else
			stck[++tos] = item;
	}
	
	// Извлечь элемент из стека
	public int pop() {
		if(tos < 0) {
			System.out.println("Стек опустошен");
			return 0;
		}
		else 
			return stck[tos--];				
	}
}