// Простая демонстрация выведения типов локальных переменных.
class VarDemo {
	public static void main(String[] args) {
		// Использовать выведение типов для определения типа переменной 
		// по имени avg. в этом случае выводится тип double;.
		var avg = 10.0;
		System.out.println("Значение avg: " + avg);
		// В следующим контексте var - не предопределенный идентификатор,
		// а просто определяемое пользователем имя переменной.
		int var = 1;
		System.out.println("Значение var: " + var);
		// Интересно отметить, что в следующем фрагменте кода var используется
		// и как тип объявления, и как имя переменной в инизиализаторе.
		var k = -var;
		System.out.println("Значение k: " + k);
	}
}