// Использование неканонического конструктора в записи

// Объявить запись для сотрудника, в которой явно объявляются 
// канонический и неканонический конструкторы

record Employee(String name, int idNum) {
	// Использовать статическое поля в записи
	static int pendingID = -1;
	// Использовать компактный канонический конструктор для удаления
	// любых ведущих и завершающих пробелов из строки Имени
	public Employee {
		// Удалить любые ведущие и завершающие пробелы
		name = name.trim();
	}
	// Это неканонический конструктор. Обратить внимание
	// что для создания записи он передает каноническому конструктору
	// не идентификационный номер, а pendingID
	public Employee(String name) {
		this(name,pendingID);
	}
}

class RecordDemo3 {
	public static void main(String[] args) {
		Employee[] empList = new Employee[4];
		
		// Создать список сотрудников с использованием Employee
		empList[0] = new Employee("Doe, John", 1047);
		empList[1] = new Employee("Jones, Robert", 1048);
		empList[2] = new Employee("Smith, Rachel", 1049);
		// Ожидающий идентификационный номер
		empList[3] = new Employee("Martin, Dave");
		
		for(Employee e:empList) {
			System.out.print("Идентификатор сотрудника " + e.name() + " является ");
			
			if(e.idNum() == Employee.pendingID) System.out.println("ожидающий");
			else System.out.println(e.idNum());
		}
		
	}
}