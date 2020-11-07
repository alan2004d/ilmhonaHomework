package Alan;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        box.height  = 80;
        box.width = 60;
        box.material = "Пластик";
        box.weight = 100;
        System.out.println("Высота:" + box.height);
        System.out.println("Ширина: " + box.width);
        System.out.println("Материал: " + box.material);
        System.out.println("Вес: " +box.weight);


    }
}

class Box {
    int height;
    int width;
    String material;
    int weight;

}

