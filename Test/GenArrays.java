// Обобщения и массивы
class ArGen<T extends Number> {
	T ob;
	
	T[] vals;
	
	ArGen(T o, T[] nums) {
		ob = o;
		
		/*
			Этот оператор недопустим
			vals nums = T{10}; // Невозможно создать массив элементов типа T
			но следующий оператор законен
		*/
		
		vals = nums; // Присваивать ссылку на существующий массив разрешено
	}
}

class GenArrays {
	public static void main(String[] args) {
		Integer[] n = {1, 2, 3, 4, 5};
		
		ArGen<Integer> iOb = new ArGen<Integer>(50,n);
		
		// Невозможно создать массив обобщенных ссылок для конкретного типа
		// ArGen<Ineger>[] gens = new ArGen<Integer>[10]; // Ошибка!
		
		// так можно
		ArGen<?>[] gens = new ArGen<?>[10];
	}
}