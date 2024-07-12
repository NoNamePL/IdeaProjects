// Использование ссылки на метода при поиске максимального значения в коллекции
import java.util.*;

class MyOwnRefClass {
	private int val;
	
	MyOwnRefClass(int v) {val = v;}
	int getVal() {return val;}
}

class UseMethodRef {
	// Метод compareMC(), совместимый с методом compare(),
	// который определен в Comparable<T>.
	static int compareMC(MyOwnRefClass a, MyOwnRefClass b){
		return a.getVal() - b.getVal();
	}
	
	public static void main(String[] args) {
		ArrayList<MyOwnRefClass> al = new ArrayList<MyOwnRefClass>();
		al.add(new MyOwnRefClass(1));
		al.add(new MyOwnRefClass(4));
		al.add(new MyOwnRefClass(2));
		al.add(new MyOwnRefClass(9));
		al.add(new MyOwnRefClass(3));
		al.add(new MyOwnRefClass(7));
		
		// Найти максимальное значение в al, используя метод compareMC()
		MyOwnRefClass maxValObj = Collections.max(al,UseMethodRef::compareMC);
		
		System.out.println("Максимальное значение равно: " + maxValObj.getVal());
	}
}