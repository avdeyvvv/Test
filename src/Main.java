public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.name);
        changeName(cat);
        System.out.println(cat.name);

        System.out.println(101%2);
    }

    public static void changeName(Cat cat) {
        cat.name = "Jerry";
    }

    public static class Cat {
        String name = "Tom";
    }
}