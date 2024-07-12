// управление главным потоком
class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread(); // получить ссылку на главный поток
		System.out.println("Текущий поток: " + t);
		// Изменить имя потока
		t.setName("My Thread");
		System.out.println("После изменения имени: " + t);
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			} 
		} catch (InterruptedException e) {
				System.out.println("Главный поток прерван");
			}
	}
}