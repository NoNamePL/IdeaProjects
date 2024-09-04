// Демонстрация использования групп потоков
class NewThread extends Thread {
    boolean suspendFlag;
    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb,threadname);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
    }

    // Точка входа в поток
    public void run() {
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Исключенгие в " + getName());
        }
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        ob1.start();
        ob2.start();
        ob3.start(); 
        ob4.start();

        System.out.println("\nВывод из list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Приостановка GroupA");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // Получить потоки в группе
        for(int i = 0; i < tga.length;i++){
            ((NewThread) tga[i]).mysuspend(); // Приостановить работу каждого потока
        }

        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Возобновить GroupA");
        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).myresume();
        }
        // Ожидать завершения работы потоков
        try {
            System.out.println("Ожидание завершения работы потоков");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Исключение в главном потоке");
        }
        System.out.println("Главный поток завершает работу");

    }
}