package Alan;

public class Main {

    public static void main(String[] args) {
        String string = "Hello world, I like Java";
        if (string.length() > 5) {
            String firstPart = string.substring(0, 3);
            String lastPart = string.substring(string.length() - 3);
            System.out.println("Первые три символа: " + firstPart);
            System.out.println("Последние три символа: " + lastPart);
        } else {
            for (int i = 0; i < string.length(); i++) {
                System.out.println(string.substring(0, 1));

            }
        }
    }
}