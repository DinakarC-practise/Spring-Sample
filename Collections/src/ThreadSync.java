public class ThreadSync {
    static Object Thread1 = new Object();
    static Object Thread2 = new Object();

    public static class ThreadOne extends Thread {
        public void run() {
            synchronized (Thread1) {
                System.out.println("Executing thread1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executing thread1 waiting on Thread2");
                synchronized (Thread2) {
                    System.out.println(" T1 No Deadlock");
                }
            }

        }

    }

    public static class ThreadTwo extends Thread {
        public void run() {
            synchronized (Thread2) {
                System.out.println("Executing thread2");

                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executing thread1 waiting on Thread2");
                synchronized (Thread1) {
                    System.out.println("T2 No Deadlock");
                }
            }
        }

    }

    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.run();
        t2.run();

    }
}

