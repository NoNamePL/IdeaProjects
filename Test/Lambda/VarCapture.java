// Пример захвата локальной переменной из объемляющей области видимости
interface MyFunc {
	int func(int n);
}

class VarCapture {
	public static void main(String[] args) {
		// Локальная переменная, которая может быть захвачена
		int num = 10;
		
		MyFunc MyLambda = (n) -> {
			// Использовать num подобным образом разрешено
			// Переменная num не модифицируется
			int v = num + n;
			
			// Однако следующая строка кода недопустимая из-за того,
			// что она пытается модифицировать значение num
			// num++;
			return v;
		};
		
		// Следующая строка кода тоже вызовет ошибку, потому что
		// Она устранит статус переменной num как фактически финальной
		// num = 9;
	}
}