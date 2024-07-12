/*
	Отображение содержимого текстового файла
	Для использования программы укажите имя файла, который хотите просмотреть
	Например, чтобы увидеть содержимое файла по имени Test.txt
	java ShowFile text.txt
*/

import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		// Удостовериться, что имя файла было указано
		if (args.length != 1){
			System.out.println("Использование: ShowFile имя файла");
			return;
		}
		
		// попытаться открыть файла
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("Не удалось открыть файл");
			return;
		}
		
		// В данной точке файл открыт и может быть прочитан
		// Следующий код читает символы до тех пор, пока не встретится EOF
		try {
			do {
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while(i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка при чтение файла");
		}
		
		// закрытие файла
		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("Ошибка при закрытие файла");
		}
		
		
	}
}