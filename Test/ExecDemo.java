// Демонстрация работы exec()
class ExecDemo{

    public static void main(String []args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении Notepad.");
        }

        System.out.println("Программа notepad возвратила " + p.exitValue());
    }

}