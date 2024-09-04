class TestClone implements Cloneable{
    int a;
    double b;

    // Переопределение метода clone() и делание его открытым
    
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Объект не разрешено клонировать");
            return this;
        }
    }
}

class CloneDemo2 {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 12;
        x1.b = 20.98;

        x2 = (TestClone) x1.clone();

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}