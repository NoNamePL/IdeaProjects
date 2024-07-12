interface CallBack {
	void callback(int param);
}

class Client implements CallBack {
	// Реализация метода интерфейса CallBack
	public void callback(int p) {
		System.out.println("callback() вызывается c " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Классы, которые реализуют интерфейсы, " + 
							"могут также определять и другие члены");
	}
}

class TestIface {
	public static void main(String[] args) {
		CallBack c = new Client();
		c.callback(42);
	}
}