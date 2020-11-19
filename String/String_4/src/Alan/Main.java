package Alan;

public class Main {

    public static void main(String[] args) {
        String string = "Matematics is the oldest of the sciences";
        if (string.length() > 10){
            string = string.substring(0,6);
        }else {
            while (string.length() != 12){
                string +='o';
            }
        }
        System.out.println(string);
    }
}

