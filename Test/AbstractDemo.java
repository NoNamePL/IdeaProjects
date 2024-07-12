// Простая демонстрация применения abstract
abstract class A {
	abstract void callme();
	
	// Конкретный метод в абстрактных классах по-прежнему разрешен
	void callmetoo() {
		System.out.println("Это конкретный метод");
	}
}

class B extends A {
	void callme() {
		System.out.println("Реализация callme() в классе B");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		B b = new B();
		
		b.callme();
		b.callmetoo();
	}
}