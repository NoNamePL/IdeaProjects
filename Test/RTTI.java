// Получить инофрмацию о типе во время выполнения
class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        Class<?> clObj;

        clObj = x.getClass(); // Получить ссылку на класс Class
        System.out.println("x - объект типа " + clObj.getName());

        clObj = y.getClass(); // Получить ссылку на класс Class
        System.out.println("y - объект типа " + clObj.getName());

    }
}