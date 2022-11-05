package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainThreadGroup = new ThreadGroup("Основная группа");

        MyThread thread1 = new MyThread(mainThreadGroup, "поток 1");
        MyThread thread2 = new MyThread(mainThreadGroup, "поток 2");
        MyThread thread3 = new MyThread(mainThreadGroup, "поток 3");
        MyThread thread4 = new MyThread(mainThreadGroup, "поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        mainThreadGroup.interrupt();
    }
}