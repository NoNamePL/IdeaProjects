public class ArrayInsert {
    private long[] a;
    private int nElems;

    public ArrayInsert(int max) {
        a = new long[max];
        nElems=0;
    }

    public void insert(long value) {
        a[nElems]=value;
        nElems++;
    }

    public void dispay(){
        for(int i=0;i<nElems;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Сортировка вставкой
    public void insertSort(){
        int in, out;

        for(out=1;out<nElems;out++){                    // out - разделительный маркер

            long temp = a[out];                         // Скопировать помеченый элемент
            in = out;                                   // Начать перемещение с out

            while(in>0 && a[in-1] >= temp) {            // Пока не найден меньший элемент

                a[in] = a[in-1];                        // Сдвинуть элемент вправо
                --in;                                   // Перейти на одну позицию влево

            }

            a[in] = temp;                              // Вставить помеченный элемент в свою позицию

        }
    }
	
	public long median() {
		long min = 9999999,max = -1;
		for(int i=0;i<nElems;i++){
			if(min>a[i])
				min = a[i];
			if(max<a[i])
				max=a[i];
		}
		return (max+min)/2;
//		return a[nElems/2];
	}
	
	public void noDups() {
		for(int i=0;i<nElems-2;i++){
			if(a[i] == a[i+1]){
				a[i] = a[i+1];
				a[i+1] = a[i+2];
			}
				
		}
	}
}
