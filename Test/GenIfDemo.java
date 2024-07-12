// Примерм обобщенного интерфейса
interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}
// Реализовать интерфейс MinMax 
class MyGenClass<T extends Comparable<T>> implements MinMax<T>{
	T[] vals;
	MyGenClass(T[] o) {
		vals = o;
	}
	
	// возвратить минимальное значение в vals
	public T min() {
		T v = vals[0];
		
		for (int i = 0; i < vals.length;i++) 
			if(vals[i].compareTo(v) < 0)
				v = vals[i];
		return v;
	}
	
	// Возвратить максимальное значение в vals
	public T max() {
		T v = vals[0];
		
		for(int i = 0; i < vals.length;i++)
			if(vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}
}

class GenIfDemo {
	public static void main(String[] args) {
		Integer[] inum = {3, 6, 2, 8, 5};
		Character[] chs = {'b', 'r', 'p', 'w'};
		
		MyGenClass<Integer> iob = new MyGenClass<Integer>(inum);
		MyGenClass<Character> cob = new MyGenClass<Character>(chs);
		
		
		System.out.println("Минимальное значение iob: " + iob.min());
		System.out.println("Максимальное значение iob: " + iob.max());
		
		System.out.println("Минимальное значение cob: " + cob.min());
		System.out.println("Максимальное значение cob: " + cob.max());
	}
}