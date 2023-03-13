package Thread;

public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();
        Thread1 thread1 = new Thread1(objectA);
        Thread2 thread2 = new Thread2(objectB);

        objectA.objectB = objectB;
        objectB.objectA = objectA;
        thread1.start();
        thread2.start();

    }
}

class ObjectA{
    ObjectB objectB;
    public synchronized void someMethod(){
        System.out.println("ObjectA's method someMethod start work");
        System.out.println(objectB.returnSomeNumber());
        System.out.println("Method someMethod end work");
    }
    public synchronized int returnSomeNumber(){
        System.out.println("Method returnSomeNumber start work");
        return 1;
    }
}

class ObjectB{
    ObjectA objectA;

    public synchronized void someMethod(){
        System.out.println("ObjectB's method someMethod start work");
        System.out.println(objectA.returnSomeNumber());
        System.out.println("Method someMethod end work");
    }
    public synchronized int returnSomeNumber(){
        System.out.println("Method returnSomeNumber start work");
        return 2;
    }
}
class Thread1 extends Thread{
    ObjectA objectA;

    public Thread1(ObjectA objectA) {
        this.objectA = objectA;
    }

    public void run(){
        objectA.someMethod();
    }
}
class Thread2 extends Thread{
    ObjectB objectB;

    public Thread2(ObjectB objectB) {
        this.objectB = objectB;
    }

    public void run(){
        objectB.someMethod();
    }
}
