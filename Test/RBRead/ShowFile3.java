/*
	В этой версии программы ShowFile3 используется оператор try с ресурсами
	для автоматического закрытия файла после того, как он больше не нужен
*/
import java.io.*;

class ShowFile3 {
	public static void main(String[] args) {
		int i;
		
		// Удостовериться, что имя файла было указано
		if(args.length != 1) {
			System.out.println("Использование: ShowFile3 имя-файла");
			return;
		}
		
		// В следующем коде применяется оператор try с ресурсами для открытия
		// файла и затем его закрытие при покидании блока try
		try (FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
		} catch (IOException e) {
			System.out.println("Произошла ошибка ввода-вывода");
		}
	}
}
