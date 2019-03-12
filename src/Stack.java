public class Stack {
    public static void main(String[] args) {

        met();
    }

    public static void met(){

        StackTraceElement[] stackTraceElements;
//        = Thread.currentThread().getStackTrace();

        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());


        String s= "Hello word";
        System.out.println(s.substring(1,2));

//
//        for (StackTraceElement s: stackTraceElements
//             ) {
//
//            System.out.println(s.getMethodName());
//
//        }

//        System.out.println(stackTraceElements);
    }
}
