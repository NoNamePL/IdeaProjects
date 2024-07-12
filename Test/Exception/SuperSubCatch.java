/* Эта программа содержит ошибку
	в последовательности конструкция catch подкласс должен
	предшествовать совему суперклассу. В противном случае будет создан
	недостижимый код, что приведет к ошибке на этапе компиляции
*/

class SuperSubCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 42/a;
		} catch (Exception e) {
			System.out.println("Перехват обобщенного исключения Exception");
		}
		/* Эта конструкция catch недостижима, потому что 
		ArithmeticException является подклассом Exception
		catch (ArithmeticException e) { // Ошибка - недостижимый код
			System.out.println("Это никогда не будет достигнуто");
		}
		*/
		
	}
}