// при работе с наследованием выведенным типо является объявленный
// тип инициализатора и он может отличаться от производного
// типа объекта, на который ссылается инициализатор
class MyClass{}

class FirstDerivedClass extends MyClass{
	int x;
	
}

class SecondDerivedClass extends MyClass{
	int y;
}

class TypeInferenecAndInheritance {
	// Возвратить некоторый тип объекта MyClass
	static MyClass getObj(int which) {
		switch(which) {
			case 0: return new MyClass();
			case 1: return new FirstDerivedClass();
			default: return new SecondDerivedClass();
		}
	}
	
	public static void main(String[] args) {
		/* 	Несмотря на то что getObj() возвращает различные типы
			Объектов в иерарзии наследования MyClass, объявленным
			типом возвращаемого значения является MyClass,
			в результате во всех трех показанных случаях
			предпологается, что типом переменных является MyClass,
			хотя получаются разные производные типы объектов
		*/
		
		// В этом случае getObj() возвращает объект MyClass
		var mc = getObj(0);
		
		// В этом случае getObj() возвращает объект FirstDerivedClass
		var mc2 = getObj(1);
		
		// в этом случае getObj() возвращает объект SecondDerivedClass
		var mc3 = getObj(2);
		
		// Поскольку типы mc2 и mc3 выводятся как MyClass (т.к возвращаемым типом
		// getObj() является MyClass), то ни mc2 ни mc3 не могут получить досуп к
		// полям, объявленным в FirstDerivedClass или SecondDerivedClass
		// mc2.x = 10; // ! Ошибка! класс MyClass не имеет поля x
		// mc3.y = 10; // ! Ошибка! класс MyClass не имеет поля y
	}
}