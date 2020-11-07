package Alan;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.tayp = "Вильямс прайд";
        apple.color = "Красное";
        boolean x = true;
        if (x) {
            System.out.println("Кислое: " +"нет");
            System.out.println("Сорт: " + apple.tayp);
            System.out.println("Цвет: " + apple.color);
        } else {


        }
    }
}
class Apple {
    String tayp;
    String color;
    boolean sour;

}

