// Использование super для преодоления сокрытия имен
class A {
	int i;
}

class B extends A {
	int i; // этот член i скрывает i в A
	
	B(int a, int b) {
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе : " + i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		B subOb = new B(1,2);
		
		subOb.show();
	}
}