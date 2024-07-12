// Демонстрация определения простого обобщенного метода
class GenMethDemo {
	// Выяснить, присутствует ли элемент в массиве
	static<T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length;i++)
			if(x.equals(y[i])) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// Использовать isIn() для объектов Inreger
		Integer[] nums = { 1, 2, 3, 4, 5};
		
		if(isIn(2,nums))
			System.out.println("2 Присутствует в numx");
		
		if(!isIn(-7,nums))
			System.out.println("-7 не присутствует");
		System.out.println();
		
		// Использовать isIn для объектов String
		String[] strs = {
			"one","two",
			"three","four",
			"five"
		};
		
		if(isIn("two",strs))
			System.out.println("two Присутствует в strs");
		if(!isIn("seven",strs))
			System.out.println("seven не присутствует");
	}
}