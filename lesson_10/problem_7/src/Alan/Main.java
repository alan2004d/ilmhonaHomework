package Alan;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.name  = "Nissan";
        car.year = 2004;
        car.color = "Синий";
        car.type = "Спорт";
        System.out.println("Марка:" + car.name);
        System.out.println("Год: " + car.year);
        System.out.println("Цвет: " + car.color);
        System.out.println("Тип: " +car.type);


    }
}

class Car {
    String name;
    int year;
    String color;
    String type;

}

