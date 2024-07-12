//  Демонстрация использования ссылки на обобщенный метод
// объявленный внутри необобщенного класса

// Функционального интерфейса, который работает с массивом
// и значениями и возвращает результат int
interface MyRefFunc<T> {
	int func(T[] vals, T v);
}

// в этом классе определен метод по имени countMatching(), который
// возвращает количество элементов в массиве, равных указанному значениями
// Обратить внимание, что метод countMatching() является объявленным
// но класс MyArrayRefOps нет
class MyArrayRefOps {
	static <T> int countMatching(T[] vals, T v) {
	
		int count = 0;
		
		for(int i = 0; i < vals.length;i++)
			if(vals[i] == v)
				count++;
		return count;
	}
}

class GenericMethodRefDemo {
	// Первый параметр этого метода имеет тип функционального интерфейса MyRefFunc
	// в остальных двух параметрах он принимает массив и значение, оба типа T
	static <T> int myOp(MyRefFunc<T> f, T[] vals, T v){
		return f.func(vals,v);
	}
	
	public static void main(String[] args) {
		Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
		String[] strs = {"One", "Two", "Three", "Two"};
		int count;
		
		count = myOp(MyArrayRefOps::countMatching, vals,4);
		System.out.println("Количество элементов 4, содержащихся в vals: " + count);
		
		count = myOp(MyArrayRefOps::countMatching,strs,"Two");
		System.out.println("Количество элементов Two, содержащихся в strs: " + count);
	}
}