// Демонстрация использования счетчиков выпусков Runtime.Version
class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        // Отобразить индивидульные счетчики
        System.out.println("Счетчик выпусков функциональных средств: " + ver.feature());
        System.out.println("Счетчик промежуточных выпусков: " + ver.interim());
        System.out.println("Счетчик выпусков обновлений: " + ver.update());
        System.out.println("Счетчик выпусков исправлений: " + ver.patch());
    }
}