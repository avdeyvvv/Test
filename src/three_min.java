public class three_min {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int m;
        if (a<=b&&a<=c) m=a;
       else if (b<=a&&b<=c) m=b;
       else m=c;
        return m;


    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
        System.out.println("1+2="+(1+2));
        Ttt t = new Ttt();
        
    }

    static class Ttt extends Thread{
        public Ttt (){
            super("fdfsdf");
        }

        public void run (){

        }
    }

}
