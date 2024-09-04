// Класс массива с низкоуровневым интерфейсом
/////////////////////////////////////////////
class LowArray{
	private long[] arr;			// Ссылка на массив arr
	
	//-------------------
	
	public LowArray(int size) { // Конструктор
		arr = new long[size];	// Создание массива
	}
	
	//-------------------
	
	public void setElem(int index, long value) // Запись элемента
	{
		arr[index] = value;
	}
	
	//-------------------
	
	public long getElem(int index) // Чтение элемента
	{
		return arr[index];
	}
	
}