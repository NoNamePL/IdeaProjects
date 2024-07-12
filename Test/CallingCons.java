// Демонстрация выполнения конструкторов
class A {
	A() {
		System.out.println("Внутри конструктора A");
	}
}

class B extends A {
	B() {
		System.out.println("Внутри конструктора B");
	}
}

class C extends B {
	C() {
		System.out.println("Внутри конструктора C");
	}
}

class CallingCons {
	public static void main(String[] args) {
		C c = new C();
	}
}