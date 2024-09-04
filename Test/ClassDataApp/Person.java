class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	// Конструктор
	public Person(String last, String first, int age) {
		lastName = last;
		firstName = first;
		this.age = age;
	}
	
	// Отображение данных об объекте
	public void displayPerson() {
		System.out.print("Last name: " + lastName);
		System.out.println(", Fist name: " + firstName);
		System.out.println(", Age: " + age);
	}
	
	// Получение фамилии
	public String getLast() {
		return lastName;
	}
}