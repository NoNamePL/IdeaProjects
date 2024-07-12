// Демонстрация средства множественного перехвата ошибки
class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b=0;
        int[] vals = {1, 2, 3};
        try {
            int result = a / b; // Сгенерировать исключение ArithmeticException
            // vals[10] = 99; // Сгенерировать исключение ArrayIndexOutOfBoundsExceptoin
            // Следующая конструкция catch перехватывает оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("После множественного перехвата");
    }
}