// Копирование файла
/*
	Для использования программы укажите имена исходного и целевого файлов
	Наример, чтобы скопировать файла по имени FIRST.txt в файл по имени
	SECOND.TXT, Введите следующую командную строку
	
	java CopyFile FIRST.TXT SECOND.TXT

*/

import java.io.*;

class CopyFile {
	public static void main(String[] args) throws IOException{
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		// Удостовериться, что были указаны оба файла 
		if (args.length != 2) {
			System.out.println("Использование: CopyFile исходный-файл целевой-файл");
			return;
		}
		
		// Копирование файла
		try {
			// Попытаться открыть
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != 1);
		} catch (IOException e) {
			System.out.println("Ошибка ввода-вывода: " + e);
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e2) {
				System.out.println("Ошибка при закрытие исходного файла");
			}
			try {
				if (fout != null) fout.close();
			} catch (IOException e2) {
				System.out.println("Ошибка при закрыти целевого файла");
			}
		}
	}
}