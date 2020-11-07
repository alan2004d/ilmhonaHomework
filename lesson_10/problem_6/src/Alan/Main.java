package Alan;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.name  = "Rulls Rois";
        car.year = 2008 ;
        car.color = "Белый";
        car.type = "Комби";
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
