package Alan;

public class Main {

    public static void main(String[] args) {
        int A = 1, B = 5;
        sumOfSqares(A, B);
        int sum = sumOfSqares(A, B);

        System.out.println(sum);
    }
    public static int sumOfSqares(int A, int B) {
        int sum = 0;
        while (A <= 5) {
            sum = (sum + (A * A) );
            A++;
        }

        return sum;
    

}
}
