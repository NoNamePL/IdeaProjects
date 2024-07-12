class ThrowsDemo {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Внутри throwOne()");
		throw new IllegalAccessException("Демонстрация");
	}
	
	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Перехвачено: " + e);
		}
	}
}