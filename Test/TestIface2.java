// Ещё одна реализация CallBack
class AnotherClient implements CallBack {
	// реализовать метод интерфейса CallBack
	public void callback(int p) {
		System.out.println("Ещё одна версия callback()");
		System.out.println("p в квадрате равно " + (p*p));
	}
}

class TestIface2 {
	public static void main(String[] args) {
		CallBack c = new Client();
		AnotherClient ob = new AnotherClient();
		c.callback(42);
		c = ob; // c теперь ссылается на объект AnotherClient
		c.callback(42);
	}
}