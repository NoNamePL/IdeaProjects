// Использования this() для перегруженных конструкторов
class MyThisClass() {
	int a;
	int b;
	
	// Инициализировать a и b по отдельности
	MyThisClass(int i, int j) {
		a = i;
		b = j;
	}
	
	// Инициализировать a и b одним и тем же значениями
	MyThisClass(int i) {
		this(i,i); // вызывается MyThisClass(i,i)
	}
	
	// Предоставить a и b стандартные значения
	MyThisClass() {
		this(0); // Вызывает MyThisClass(0);
	}
}