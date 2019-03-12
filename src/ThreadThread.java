public class ThreadThread {
    public static void main(String[] args) throws InterruptedException{

        TestThread test = new TestThread();
        Thread go = new Thread(test);
        go.start();
        Thread.sleep(3000);
        System.out.println("Ща тормознём");
        go.interrupt();


    }


    public static class TestThread implements Runnable{
        public void run (){


            Thread main = Thread.currentThread();


//                try {
                    while (!main.isInterrupted()) {
                        System.out.println("Tik");
//                        Thread.sleep(500);
                    }
//                } catch (InterruptedException e) {
//                    System.out.println("Stop");
//                }

        }
    }
}
