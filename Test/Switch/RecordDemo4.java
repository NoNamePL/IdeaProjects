record Employee(String name, int idNum) {
	// Использование компактного канонического конструктора для удаления
	// любых ведущих пробелов в компоненте name. Кроме того,
	// реализуется базовая проверка то го, что строк, переданая в параметре
	// name, предаставлена в требуемом формате "Фамилия, имя"
	public Employee {
		// Удалить любые ведущие и завершающие пробелы
		name = name.trim();
		
		// Выполнить минимальную проверку того, что name
		// Находится в формате "Фамилия, имя"
		
		// Сначала удостовериться что name содержит только одну запятую
		int i = name.indexOf(','); // Искать разделяющую запятую
		int j = name.lastIndexOf(',');
		if(i!=j) throw
			new IllegalArgumentException("Обнаружено несколько запятых");
		
		// затем удостовериться, что до и после запятой имеется
		// хотя бы по одному слову
		if(i < 1 | name.length() == i+1) throw
			new IllegalArgumentException("Требуемый формат: Фамилия, имя");
	}
	
	// Метод экземпляра, который возвращает только фамилию, без имени
	String lastName() {
		return name.substring(0, name.trim().indexOf(','));
	}
}

class RecordDemo4 {
	
	public static void main(String[] args) {
		Employee emp = new Employee("Doe, John",1047);
		
		// Отобразить немодифицированный компанент name
		System.out.println("Имя и фамилия сотрудника: " + emp.name());
		
		// Отобразить только фамилию
		System.out.println("Фамилия сотрудника: " + emp.lastName());
		
	}
}