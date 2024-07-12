// Использование статистического импортирования для помещения
// sqrt() и pow() в области видимости
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Вычислить гипотенузу прямоугольного треугольника
class Hypot2 {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		
		side1 = 3.0;
		side2 = 4.0;
		
		// Метод sqrt() и pow() можно вызвать
		// сами по себе, без имени их класса
		hypot = sqrt(pow(side1,2)+pow(side2,2));
		
		System.out.println("При заданных длинах сторон " +side1 + " и " + side2 + " гипотенуза равна " + hypot);
	}
}