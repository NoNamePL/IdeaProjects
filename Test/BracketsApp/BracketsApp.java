import java.io.*;

class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while(true) {
			System.out.print("Enter string containing delimeters: ");
			System.out.flush();
			input = getString();							// Чтение с клавиатуры
			if(input.equals(""))							// Завершение, если введи [Enter]
				break;
				
															// Создани объекта BracketChecker
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();								// Проверка парных скобок
		}
	}
	
	public static String getString() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}
}