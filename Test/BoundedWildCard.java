// Двумерные координаты 
class TwoD {
	int x,y;
	
	TwoD(int a, int b) {
		x = a;
		y = b;
	}
}

// Трехмерные координаты
class ThreeD extends TwoD{
	int z;
	
	ThreeD(int a, int b, int c){
		super(a,b);
		z = c;
	}
}

// Четырёхмерные координаты
class FourD extends ThreeD {
	int t;
	
	FourD(int a, int b, int c, int d) {
		super(a,b,c);
		t = d;
	}
}

// этот класс хранит массив координаты
class Coords<T extends TwoD>{
	T[] coords;
	
	Coords(T[] o){
		coords = o;
	}
}

class BoundedWildCard {

	static void showXY(Coords<?> c) {
		System.out.println("Координаты X Y:");
		for(int i = 0; i < c.coords.length;i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}
	
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("Координаты X Y Z:");
		for(int i = 0; i < c.coords.length; i++) 
			System.out.println(c.coords[i].x + " " +
							   c.coords[i].y + " " +
							   c.coords[i].z);
		System.out.println();
	}
	
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("Координаты X Y Z T:");
		for(int i = 0; i < c.coords.length; i++) 
			System.out.println(c.coords[i].x + " " +
							   c.coords[i].y + " " +
							   c.coords[i].z + " " +
							   c.coords[i].t);
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD[] td = {
			new TwoD(0,0),
			new TwoD(7,9),
			new TwoD(18,4),
			new TwoD(-1,-23)			
		};
		
		Coords<TwoD> tdlocs = new Coords<TwoD>(td);
		
		System.out.println("Содержимое tdlocs");
		showXY(tdlocs); // Нормально, этот объект TwoD
		// showXYZ(tdlocs); // Ошибка, не объект ThreeD
		// showAll(tdlocs; // Ошибка, не объект FourD
		
		// Создать экземпляр объектов FourD
		FourD[] fd = {
			new FourD(1,2,3,4),
			new FourD(6,8,14,8),
			new FourD(22,9,4,9),
			new FourD(3,-2,-23,17)
		};
		
		Coords<FourD> fdlocs = new Coords<FourD>(fd);
		
		System.out.println("Содержимое fdlocs");
		// Все вызовы выполняются успешно
		showXY(fdlocs);
		showXYZ(fdlocs);
		showAll(fdlocs);
	}
}