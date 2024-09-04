// Работа с очередью
class QueueApp {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5);					// Очередь из пяти ячеек
		
		theQueue.insert(10);							// Вставка 4 элементов
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		try  {
			theQueue.remove();								// Извлечение 3 элементов
			theQueue.remove();
			theQueue.remove();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		theQueue.insert(50);							// Вставка ещё 4 элементов
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		// Извлечение и вывод всех элементов
		while( !theQueue.isEmpty()) {
			long n = 0;
			try {
				n = theQueue.remove();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
		
	}
}