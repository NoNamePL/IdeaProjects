import mypack.*;

class TestBalance {
	public static void main(String[] args) {
		/*
			Поскольку Balance открыт, вы можете использовать
			класс Balance и вызывать его конструктор
		*/
		Balance test = new Balance("J. J. Jaspers",99.88);
		
		test.show(); // также можно вызвать метод show()
	}
}