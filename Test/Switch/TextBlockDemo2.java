// Использование двойных кавычек в текстовом блоке
class TextBlockDemo2 {
	public static void main(String[] args) {
		String str = """
		Внутри текстового блока можно указывать двойных кавычки без необходимости
		в использовании управляющих последовательностей. Напрример:
		Он сказал: "На крыше кот".
		Она спросила: "Как он туда попал?"
					""";
		System.out.println(str);
	}
}