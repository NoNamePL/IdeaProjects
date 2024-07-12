// Применение строки для управления оператором switch
class StringSwitch {
	public static void main(String [] args) {
		String str = "two";
		
		switch (str) {
			case "one":
				System.out.println("Один");
				break;
			case "two":
				System.out.println("два");
				break;
			case "three":
				System.out.println("Три");
				break;
			default:
				System.out.println("Совпадений нет");
				break;
		}	
	}	
}