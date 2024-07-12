class IFTest {
	public static void main(String[] args) {
		IntStack mystack1 = new FixedStack(5);
		IntStack mystack2 = new FixedStack(8);
		
		// Поместить несколько чисел в стеки
		for(int i = 0;i < 5;i++) mystack1.push(i);
		for(int i = 0;i < 8;i++) mystack2.push(i);
		
		// Извлечь эти числа из стеков
		System.out.println("Стек в mystack1:");
		for(int i = 0;i < 5;i++)
			System.out.print(mystack1.pop() + " ");
		System.out.println("\nСтек в mystack2");
		for(int i = 0;i < 8;i++)
			System.out.print(mystack2.pop() + " ");
	
		IntStack mystack3 = new FixedStack(5);
		
		for(int i = 0; i < 5;i++) mystack3.push(i);
		
		// Получить массив из 
		int[] popMassive = new int[5];
		popMassive = mystack3.popNElements(3);
		for (int i = 0; i < 3;i++) {
			System.out.println(popMassive[i]);
		}
	
	}
}