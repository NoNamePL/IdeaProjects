// Использование операторов case со стрелками в операторе switch
class StatmentSwitchWithArrows {
	public static void main(String[] args) {
		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;
		char direction = 'R';
		
		// Использовать операторы case со стрелками в операторе switch 
		// Обратить внимание, что значение не производится
		switch(direction) {
			case 'L' -> {
				System.out.print("Повернуть налево ");
				left++;
			}
			case 'R' -> {
				System.out.print("Повернуть направо ");
				right++;
			}
			case 'U' -> {
				System.out.print("Двигаться вверх ");
			}
			case 'D' -> {
				System.out.print("Двигаться вниз ");
				down++;
			}
		}
		System.out.println(right);
	}
}