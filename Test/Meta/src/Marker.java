import java.lang.annotation.*;
import java.lang.reflect.*;

// Маркерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarket{}

class Marker {
	// Аннотировать метод, используя маркерную аннотацию
	// обратить вниманеи, что скобки не употребляются
	@MyMarket
	public static void myMeth() {
		
		Marker ob = new Marker();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			
			// Выяснить, присутствует ли аннотация
			if(m.isAnnotationPresent(MyMarket.class))
				System.out.println("MyMarker присутствует");
			else 
				System.out.println("Marker отсутствует");
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод не найден");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}