// Приложение, которое содержит список объектов
class ClassDataArray {
	private Person[] a;			// Ссылка на массив
	private int nElems;			// Количество элементов данных
	
	public ClassDataArray(int max) {
		a = new Person[max];	// Создание массива
		nElems = 0;				// массив пока не содержит элементов
	}
	
	
	// Поиск объекта в списке 
	public Person find(String searchName) {
		int j;					
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName))	// Значение найдено
				break;
			if(j==nElems)							// Не найдено
				return null;
			else 
				return a[j];
	}
	
	// Включение запись в массив
	public void insert(String last, String first, int age) {
		a[nElems] = new Person(last,first,age);
		nElems++;
	}
	
	public boolean delete(String searchName) {
		int j;								// Удаление из массива
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName))
				break;
			if(j==nElems)					// Не удалось найти
				return false;
			else {
				for(int k = 0;k < nElems;k++)
					a[k] = a[k+1];
				nElems--;
				return true;
			}
	}
	
	public void displayA() {
		for(int j=0;j<nElems;j++)
			a[j].displayPerson();
	}
}