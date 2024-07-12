class Stats<T extends Number> {
	T[] nums; // массив элементов класса Number или его подкласса
	// класс Number или его подкласс
	Stats(T[] o) {
		nums = o;
	}
	
	// Во всех случаях возвращать результат типа double
	double average() {
		double sum = 0.0;
		
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum/nums.length;
	}
	
	// Выяснить, одинаковы ли два средних значения
	// обратить внимание на использование подстановочного знака
	boolean isSameAvg(Stats<?> ob) {
		if(average() == ob.average())
			return true;
		return false;
	}
}

class BoundsDemo {
	public static void main(String[] args) {
		
		Integer[] inums = { 1, 2, 3, 4, 5};
		Stats<Integer> iOb = new Stats<Integer>(inums);
		
		double val = iOb.average();
		System.out.println("Среднее значение iOb равно " + val);
		
		Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dob = new Stats<Double>(dnums);
		
		double w = dob.average();
		System.out.println("Среднее значение dob равно" + w);
		
		//String[] strnums = {"1","2","3", "4","5"};
		//Stats<String> strob = new Stats<String>(strnums);
		
		//double x = strob.average();
		//System.out.println("Среднее значнеие strob равно " + x);
		
		Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
		Stats<Float> fob  = new Stats<Float>(fnums);
		double x = fob.average();
		
		// Выяснить, какие массивы имеют одинаковые средние значения
		System.out.print("Среднее значение iob и dob ");
		if (iOb.isSameAvg(dob))
			System.out.println("одинаковы");
		else
			System.out.println("отличаются");
		System.out.print("Среднее значение iob и fob ");
		if (iOb.isSameAvg(fob))
			System.out.println("одинаковы");
		else
			System.out.println("отличаются");
		
	}
}
