public class ArrayInOb {

    long min = 999999,max = -1;

    private Person[] a;             // Ссылка на массив
    private int nElems;             // Количество элементов в массиве

    public ArrayInOb(int max){      // Конструктор
        a = new Person[max];
        nElems=0;
    }
    // Включение записи в массив
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;           // Увеличение размера
    }

    public void display() {
        for(int i=0;i<nElems;i++)
            a[i].displayPerson();
        System.out.println("");
    }

    public void insertSort(){
        int out, in;
        Person temp;
        for(out=1;out<nElems;out++) {            // out - разделительный маркер
            temp = a[out];                      // Скопировать помеченый элемент
            in = out;                           // Начать перемещение с out

            while (in > 0 &&
                    a[in - 1].getLast().compareTo(temp.getLast()) > 0) {            // Пока не меньший элемент

                a[in] = a[in - 1];                // Сдвинуть позицию вправо
                --in;                           // Перейти на одну позицию влево
            }
            a[in] = temp;                       // Вставить помеченый элемент
        }
    }



}
