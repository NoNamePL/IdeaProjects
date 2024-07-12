// Вычислить гипотенузу прямоугольного треугольника
class Hypot {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.0;
		
		// Обратить внимание на то, что sqrt() и pow() должны
		// быть уточнены именем их класса, т.е Math
		hypot = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
		
		System.out.println("При заданных длинах сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
	}
}