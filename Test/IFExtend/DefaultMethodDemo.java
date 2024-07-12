// Реализация MyIF
class MyIFImp implements MyIf {
	// Необходимо реализовать только метод getNumber(), определенный в MyIF
	// Для метода getString() разрешено применять стандартную реализацию
	public int getNumber() {
		return 100;
	}
}

// Использовать стандартный метод
class DefaultMethodDemo {
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		// Метод getNumber() можно вызвать, потому что
		// он явно реализован в MyIFImp
		System.out.println(obj.getNumber());
		
		// Метод getString() тоже можно вызвать
		// из-за наличия стандартной реализации
		System.out.println(obj.getString());
		
		// Вывов статического метода 
		int defNum = MyIf.getDefaultNumber();
		System.out.println(defNum);
	}
}