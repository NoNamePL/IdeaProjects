class ArraySelect {
    private long[] a;
    private int nElems;

    public ArraySelect(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void selectSort() {                      // Сортировка методом выбора
        int out, in, min;

        for(out = 0; out < nElems-1; out++) {
            min = out;
            for(in = out+1;in < nElems;in++ )
                if(a[in] < a[min])
                    min=in;
            swap(min,out);
        }

    }

    public void swap(int min, int out){
        long temp = a[min];
        a[min] = a[out];
        a[out] = temp;
    }

    public void displayA() {                         // Отображение элементов массива
        for(int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

}