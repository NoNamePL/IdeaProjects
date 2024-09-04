// Хронометраж выполнения программы.
class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Хронометраж цикла for от 0 до 100 000 000");

        // Хронометрировать цикл for от 0 до 100 000 000
        start = System.nanoTime(); // Получить время начала
        for(long i = 0; i < 10000000L;i++);
        end = System.nanoTime(); // Получить время окончания

        System.out.println("Затраченное время: " + (end-start));
    }
}