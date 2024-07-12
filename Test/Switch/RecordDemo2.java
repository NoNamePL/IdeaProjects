// использование компактного конструктора записи

// объявить запись для сотрудника
record Employee(String name, int idNum) { 
	// Использование компактного канонического для удаления
	// любых ведущих и завершающих пробелов из строки имен
	public Employee {
		// Удалить любые ведущие и завершающие пробелы
		name = name.trim();
	}
}

class RecordDemo2 {
	public static void main(String[] args) {
		Employee[] empList = new Employee[4];
		
		
		// Здесь имя имеет ведущих или завершающих пробелов
		empList[0] = new Employee("Doe, John", 1047);
		// Следующие три имени содержат ведущие и/ или заверщающие пробелы
		empList[1] = new Employee("   Jones, Robert", 1048);
		empList[2] = new Employee("Smith, Rachel  ", 1049);
		empList[3] = new Employee("  Martin, Dave   ", 1050);
		for(Employee e:empList)
			System.out.println("Идентификатором сотрудника " + e.name() + " является " + e.idNum());
	}
}