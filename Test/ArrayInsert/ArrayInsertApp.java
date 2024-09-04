public class ArrayInsertApp {
    public static void main(String[] args) {
        int maxSize = 10000;
        ArrayInsert arr;
        arr = new ArrayInsert(maxSize);

//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);

		for(int j=0;j<maxSize;j++) {
			long n = (long)(java.lang.Math.random()*(maxSize-1));
			arr.insert(n);
		}

        arr.dispay();

        arr.insertSort();

        arr.dispay();
		System.out.println("");
		System.out.println("Средняя: " + arr.median());
		
		arr.noDups();
		
		arr.dispay();
    }
}
