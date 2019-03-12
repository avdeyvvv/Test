public class Car {
    String model;
    int maxSpeed;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Ferarri";
        car1.maxSpeed = 300;
        Car car2 = new Car();
        car2.model = "Ferarri";
        car2.maxSpeed = 300;
        System.out.println(car1==car2);

        int a = 8;
        int b = 5;
        int c = 8 | 5;
        System.out.println(c);

    }
}
