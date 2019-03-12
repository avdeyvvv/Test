public class sol2 {
    public static int min(int a, int b) {
        //напишите тут ваш код
        int c;
        if (a<b){
            c = a;
        }
        else c = b;
        return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
