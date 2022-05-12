package com.Practice;
class Threading1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(" I am Breathing");
            i++;
        }
    }
}
class Threading2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(" I am Swallowing");
            i++;
        }
    }
}
class Abrar implements Runnable{
    @Override
    public void run() {
        int tummy = 0;
        while (tummy <= 600) {
            System.out.println("Abrar wants to eat more");
            tummy++;
        }
    }
}

class Khalid implements Runnable {
    @Override
    public void run() {
        int tummy = 0;
        while (tummy <= 450) {
            System.out.println("Khalid wants to eat more");
            tummy++;
        }
    }
}

class Muddu implements Runnable {
    @Override
    public void run() {
        int tummy = 0;
        while (tummy <= 400) {
            System.out.println("Muddu wants to eat more");
            tummy++;
        }
    }
}

class Tassu implements Runnable {
    @Override
    public void run() {
        int tummy = 0;
        while (tummy <= 100) {
            System.out.println("Tassu wants to eat more");
            tummy++;
        }
    }
}

interface bun{
    public void  me();
}


public class strong {
    public static void main(String[] args) {

  bun bee = new bun() {
      @Override
      public void me() {

      }
  };











    Threading1  t1 = new Threading1();
    Threading2  t2 = new Threading2();
//    t1.run();
//    t2.run();

    Abrar ab = new Abrar();
    Thread abr = new Thread(ab);
    Khalid kha = new Khalid();
    Thread khal = new Thread(kha);
    Muddu mud = new Muddu();
    Thread mudd = new Thread(mud);
    Tassu Bussu = new Tassu();
    Thread Buss = new Thread(Bussu);
//    abr.start();
  //  khal.start();
   // mudd.start();
    //Buss.start();
        System.
                out.
                println
                        ("I Work");
    }
}
