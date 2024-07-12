// Создание второго потока путем расширения класса Thread
class NewThread extends Thread {
	NewThread() {
		// создать новый, второй поток
		super("Demo Thread");
		System.out.println("Дочерний поток:" + this);
	}
	
	// Это точка входа для второго потока
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван");
		}
	}
}

class ExtendThread {
	public static void main(String[] args) {
		NewThread nt = new NewThread(); // создать новый поток
		nt.start();
		
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Главный поток: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Завершени главного потока");
	}
}