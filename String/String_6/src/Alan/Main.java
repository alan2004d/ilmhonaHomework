package Alan;

public class Main {

    public static void main(String[] args) {
        String string1 = "word";
        String string2 = "lord";
        String result = "";

        for(int i=0; i<string1.length(); i++) {
            char temp = string1.charAt(i);
            if(quantityOfSymbolInString(string1, temp) == 1  &&
                    quantityOfSymbolInString(string2, temp) == 1) {
                result = append(result, String.valueOf(temp));
            }
        }

        for(int i=0; i<string2.length(); i++) {
            char temp = string2.charAt(i);
            if(quantityOfSymbolInString(string1, temp) == 1  &&
                    quantityOfSymbolInString(string2, temp) == 1) {
                result = append(result, String.valueOf(temp)); //String String
            }
        }

        System.out.println(result);
    }

    private static int quantityOfSymbolInString(String string, char symbol) {
        int counter = 0;
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }

    private static String append(String main, String symbol) {
        if(!main.contains(symbol)) { // home
            main += " " + symbol + " ";
        }
        return main;
    }
}
