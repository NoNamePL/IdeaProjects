// Демонстрация использования ссылки на метод экземпляра

// Функциональный интерфейс для операции над строками
interface StringFunc {
	String func(String n);
}

// Теперь в этом классе определен метод экземпляра по имени strReverse()
class MyStringOps {
	String strReverse(String str) {
		String result = "";
		int i;
		
		for(i = str.length()-1;i >= 0;i--)
			result += str.charAt(i);
		return result;
	}
}

class MethodRefDemo2 {
	// Первый параметр этого метода имеет тип функционального интерфейс
	// Таким образом, ему можно передавать любой экземпляр реализации
	// интерфейса StringFunc, включая ссылку метода
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		// Создать объект MyStringOps
		MyStringOps strOps = new MyStringOps();
		
		// Передать в stringOP() ссылку на метод экземпляра strReverse();
		outStr = stringOp(strOps::strReverse,inStr);
		
		System.out.println("Исходная строка: " + inStr);
		System.out.println("Строка с противоположным порядком следования символов: " + outStr);
	}
}