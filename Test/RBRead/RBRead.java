// Использование объекта BufferedReader для чтения символов консоли
import java.io.*;

class RBRead {
	public static void main(String[] args) throws IOException {
		char c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
		
		System.out.println("Вводите символы; для выхода введите q");
		// чтение символов
		do {
			c = (char) br.read();
			System.out.println(c);
		} while ( c != 'q');
	}
}