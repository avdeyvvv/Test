public class Jarvis {
    public void SayHi (String...names) {
        for (String name: names) {
            System.out.println("Добрый вечер, "+name+ ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.SayHi("Вася","Петя","Жора");
        int a = -1;
        int b = -2;
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
}
