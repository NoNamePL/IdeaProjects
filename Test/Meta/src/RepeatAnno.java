// Демонстрация использования повторяющих аннотаций
import java.lang.annotation.*;
import java.lang.reflect.*;

// Сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
	String str() default "Тест";
	int val() default 9000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyAnno[] value();
}

class RepeatAnno {
	
	// Повторить аннотацию MyAnno для метода myMeth()
	@MyAnno(str = "Первая аннотация", val = -1)
	@MyAnno(str = "Вторая аннотация", val = 100)
	public static void myMeth(String str, int val) {
		
		RepeatAnno ob = new RepeatAnno();
		
		try {
			Class<?> c = ob.getClass();
			
			// Получить аннотации для метода myMeth()
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			// Отобразить повторяющиеся аннотации MyAnno
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод не найден");
		}
	}
	
	public static void main(String[] args) {
		myMeth("Тест", 10);
	}
}