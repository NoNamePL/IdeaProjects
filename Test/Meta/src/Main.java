//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
    // Аннотировать метод
    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        // Получить аннотацию для этого члена
        // и отобразить значения её членов

        try {
            // Для начала получить объект Class
            // который представляет данный класс
            Class<?> c = ob.getClass();

            // Теперь получить объект Method
            // который представляет данный метод
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Далее получить аннотацию для этого класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // в заключение вывести значение
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("ТЕст", 10);
    }

}

