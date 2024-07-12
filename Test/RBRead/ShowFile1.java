import java.io.*;

class ShowFile1 {
	public static void main(String[] args) {
		
		int i;
		FileInputStream fin = null;
		
		if (args.length != 1) {
			System.out.println("Введите название файла: java ShowFile1 test.txt");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			
			do {
				i = fin.read();
				if (i != -1) System.out.println((char) i);
			} while( i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка при работе с файлом: " + e);
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Ошибка при закрытие файла");
			}
		}
	}
}