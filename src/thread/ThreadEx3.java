package thread;

public class ThreadEx3 {

    public static void main(String[] args) {
        ThreadEx3_1 t = new ThreadEx3_1();
        System.out.println(Thread.currentThread().getName());
        t.run();
    }

    private static class ThreadEx3_1 extends Thread {
        public void run() {
            System.out.println(getName());
            throwException();
        }

        private void throwException() {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
