import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой логин и id для входа в учетную запись");
        String name = sc.nextLine();
        String id = sc.nextLine();
        BankAccount bankAccount = new BankAccount(name, id);
        System.out.println("Введите операцию b - узнать текущий баланс, i - пополнить баланс, \n" +
                "o - снять деньги со счета, e - чтобы выйти из учетной записи");
        String operation = sc.nextLine();
        while (operation!="e") {
            switch (operation) {
                case "b":
                    System.out.println(bankAccount.getBalance());
                    break;
                case "i":
                    System.out.println("Введите сумму для пополнения:");
                    int sum = sc.nextInt();
                    bankAccount.deposit(sum);
                    break;
                case "o":
                    System.out.println("Введите, сколько денег вы хотите снять");
                    int money = sc.nextInt();
                    bankAccount.withdraw(money);
                    break;
                case "e":
                    System.out.println("Вы вышли из учетной записи");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Введите корректное значение");
                    break;
            }
            operation = sc.nextLine();
        }
        System.out.println("Вы вышли из учетной записи");
        sc.close();
    }
}

class BankAccount {
    int balance;
    String name;
    String accountNumber;
    String accountID;

    public BankAccount(String name, String accountID) {
        this.name = name;
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit (int amount) {
        this.balance += amount;
        System.out.println("Ваш баланс: " + this.balance);

    }

    public void withdraw(int amount) {
        if (this.balance!=0)
            this.balance -= amount;
        else
            System.out.println("Недостаточно средств на счете");
        System.out.println("Ваш баланс: " + this.balance);
    }

}