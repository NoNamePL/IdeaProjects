// Демонстрация использования ArrayList
import java.util.*;

class ArrayDemo {
    public static void main(String[] aargs) {
        // Создать списковый массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер al: " + al.size());

        // Добавить эелементы в списковый массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Размер al после добавления эелементов: " + al.size());
        // Отобразить списковый массив
        System.out.println("Содержимое al: " + al);

        // Удалить элементы из списового массива
        al.remove("F");
        al.remove(2);
        System.out.println("Размер al после удаления элементов: " + al.size());
        System.out.println("Содержимое al: " + al);

    }
}