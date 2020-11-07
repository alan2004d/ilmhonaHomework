package Alan;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = -2;
        max(x, y);
        int maxElement = max(x, y);
        System.out.println(maxElement);


    }
    public static int max (int x, int y) {
        int maxElement = 0;
        if (x > y){
            maxElement  = x;
        }
        else { if(y > x){
            maxElement = y;
        }

        }return maxElement;

    }
}
