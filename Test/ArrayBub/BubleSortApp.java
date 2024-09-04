
class BubleSortApp {
	public static void main(String[] args) {
		int maxSize = 10000;							// Размер массива
		ArrayBub arr;								// Ссылка на массив
		arr = new ArrayBub(maxSize);				// Создание масива
		
	/*	
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
*/
		for(int j=0; j<maxSize;j++) {				// Заполнение массива случайными числами
			long n = (long)(java.lang.Math.random()*(maxSize-1));
			arr.insert(n);
		}

		arr.display();								// Вывод элементов

		arr.bubleReverseSort();							// Пузырьковая сортировка элементов
		arr.display();
	}
}