// Демонстрация использования лямбда-выражения, принимающего параметра

// Еще один функциональный интерфейс
interface NumericTest {
	boolean test(int n);
}

class LambdaDemo2 {
	public static void main(String[] args) {
		// лямбда-выражение, которое проверяет, четное ли чесло
		NumericTest isEven  = (n) -> (n%2) == 0;
		if(isEven.test(10)) System.out.println("10 -- четное число");
		if(!isEven.test(9)) System.out.println("9 -- нечетное число");
		
		// Лямбда-выражени, которое проверяет, является ли
		// число неотрицательным
		NumericTest isNonNeg = (n) -> n > 0;
		if(isNonNeg.test(1)) System.out.println("1 -- неотрицательное число");
		if(!isNonNeg.test(-1)) System.out.println("-1 -- отрицательное число");
	}
}