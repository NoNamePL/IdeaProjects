// Демонстрация работы HashSet
import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        // Создать хеш-таблицу
        HashSet<String> hs = new HashSet<String>();

        // Добавить элемент в хеш-таблицу
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
        
    }
}