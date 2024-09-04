// bank.java
// Демонстрация базового синтаксиса ООП
// Запуск программы: C>java BankApp

class BankAccount {
	private double balance; // Баланс счета
	
	public BankAccount(double openingBalance) { // Конструктор
		balance = openingBalance;
	}
	
	public void deposit(double amount) { // Внесение средст
		balance = balance + amount;
	}
	
	public void withdraw(double amount) { // Снятие средст
		balance = balance - amount;
	}
	
	public void display() { // Вывод баланса
		System.out.println("Balance = " + balance);
	}
}

/////////////////////////////////////////////////////////////////
class BankApp {
	public static void main(String[] args) {
		BankAccount bankAccount  = new BankAccount(100.00); // создение счета

		System.out.println("Before transactions. ");
		bankAccount.display();
		
		bankAccount.deposit(74.23);
		bankAccount.withdraw(20.25);
		
		System.out.println("After transactions. ");
		bankAccount.display();
	}
}