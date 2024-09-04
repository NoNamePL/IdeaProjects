// Демонстрация использования TreeSet
import java.util.*;

class TreeSetDemo{
    public static void main(String[] args) {
        // Создать древовидный набор
        TreeSet<String> ts = new TreeSet<String>();

        // Добавить элемент в древовидный набор
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}