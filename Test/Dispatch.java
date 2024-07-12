// Динамическая диспетчеризация методов
class A {
	void callme() {
		System.out.println("Внутри метода callme() класса A");
	}
}

class B extends A {
	// Переопределить callme()
	void callme() {
		System.out.println("Внутри метода callme() класса B");
	}
}

class C extends B {
	void callme() {
		System.out.println("Внутри метода callme() класса C");
	}
}

class Dispatch {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A r; // ссылка типа A
		
		r = a; // r ссылается на объект A
		r.callme();
		
		r = b;// r ссылается на объект B
		r.callme();
		
		r = c;
		r.callme();
		
	}
}
