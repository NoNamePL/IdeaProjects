// Демонстрация использования метода clone()
class TestClone implements Cloneable {
    int a;
    double b;

    // Этот метод вызывает clone() из Object
    TestClone cloneTest() {
        try {
            // Вызвать clone() из Object
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не разрешено.");
            return this;
        }
    }
}

class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = x1.cloneTest(); // клонировать x1
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b); 
    }
}