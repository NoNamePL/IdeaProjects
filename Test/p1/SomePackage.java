package p1;

class SomePackage {
	SomePackage() {
		Protection p = new Protection();
		System.out.println("Конструктор класса из того же пакета");
		System.out.println("n = " + p.n);
		// Только из класса
		// System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}