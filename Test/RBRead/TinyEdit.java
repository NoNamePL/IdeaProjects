// Крошечный текстовый редактор
import java.io.*;

class TinyEdit {
	public static void main(String[] args) throws IOException {
		// создать объект BufferedReader, используя Stream.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
		
		String[] str = new String[100];
		System.out.println("Вводите строки текста");
		System.out.println("Для завершения введите stop");
		for (int i = 0; i <100;i++) {
			str[i] = br.readLine();
			if (str[i].equals("stop")) break;
		}
		
		System.out.println("\nВот то, что вы введи");
		for (int i = 0; i < 100;i++) {
			if (str[i].equals("stop")) break;
			System.out.println(str[i]);
		}
	}
}