package exam;

public class OddEx {
    public static void main(String[] args) {
        Odd odd = new Odd(10);
        System.out.println(odd.isOdd() ? "홀수" : "짝수");
    }
}
