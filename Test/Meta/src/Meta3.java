import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации, включающее стандартные значения
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str() default "Test";
	int val() default 9000;
}

class Meta3 {
	
	// Аннотировать метод с использованием стандартных значений
	@MyAnno()
	public static void myMeth() {
		Meta3 ob = new Meta3();
		
		// получить аннотацию для этого метода
		// и вывести значения её членов
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод не найден");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}