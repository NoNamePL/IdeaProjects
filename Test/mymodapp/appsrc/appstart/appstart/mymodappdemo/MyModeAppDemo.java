// Простой пример приложения, основанного на модулях
package appstart.mymodappdemo;

import appfuncs.simpleMathfuncs.SimpleMathFuncs;

public class MyModeAppDemo {
	public static void main(String[] args) {
		if(SimpleMathFuncs.isFactor(2,10))
			System.out.println("2 является делителем 10");
		System.out.println("Наименьший общий делитель для 35 и 105 равен " + SimpleMathFuncs.lcf(35,105));
		System.out.println("Наибольший общий делитель для 35 и 105 равен " + SimpleMathFuncs.gcf(35,105));
	}
}
