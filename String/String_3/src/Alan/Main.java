package Alan;

public class Main {

    public static void main(String[] args) {
        String string = "hello exercise or world";
        String x = "x";
        String w = "w";
        if(!string.contains(x)) {
            System.out.println("Строка не содержит x");
            if(!string.contains(w)) {
                System.out.println("Ни одного из символов нет");
            } else {
                check(string);
            }
        } else {
            check(string);
            if(!string.contains(w)) {
                System.out.println("Символа w нет");
            }
        }
    }

    private static void check(String string) {
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i) == 'x' || string.charAt(i) == 'w') {
                System.out.println(string.charAt(i));
                break;
            }
            if(i+1 == string.length()) {
                System.out.println("Символы отсутствуют");
                break;
            }
        }
    }
}
