// Преобразование ArrayList в массив
import java.util.*;

class ArrayListToArray {
    public static void main(String[] args) {
        // Создать списковый массив
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Добавить элементы в списковый массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое массива al: " + al);

        // Получить массив
        Integer[] ia = new Integer[al.size()];
        ia =  al.toArray(ia);
        int sum = 0;

        // Проссумировать элементы массива
        for(int i = 0; i < ia.length;i++) sum+= ia[i]; //мой 
        // for(int i : ia) sum+=i;
        System.out.println("Сумма элементов массива: " + sum);

    }
}