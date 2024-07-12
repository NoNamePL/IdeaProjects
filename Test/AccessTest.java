/*
	В этой программе демонстрируется отличие между public и private
*/

class Test {
	int a;
	public int b;
	private int c;
	
	void setc(int i) {
		c = i;
	}
	
	int getc() {
		return c;
	}
}

class AccessTest {
	public static void main(String[] args) {
			Test ob = new Test();
			
			// Поступать так законно, т.к. к членам a и b разрешен прямой доступ
			ob.a = 10;
			ob.b = 20;
			
			// так поступать нельзя, т.к возникает ошибка
			// ob.c = 100; // Ошибка!
			
			// Получить доступ к члену с необходимо через его методы
			ob.setc(100); // нормально
			System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
	}
}