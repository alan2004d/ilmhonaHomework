package Alan;

public class Main {

    public static void main(String[] args) {
        String string = "nomo loco";
        char lastSymbol = string.charAt(string.length() - 1);
        System.out.println("Последний символ: " + lastSymbol);
        int i;
        for (i = 0; i < string.length(); i++) {

        if (string.charAt(i) == lastSymbol)

            System.out.println(i + 1 + " ");
        }
    }
}
