package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
        // Lambda lambda = new Lambda(){

        //     @Override
        //     public void method() {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Unimplemented method 'method'");
        //     }

        // };
        // lambda.method();
        Lambda lambda = () -> System.out.println("함수형 인터페이스");
        lambda.method();

        lambda = () -> {
            int i = 10;
            System.out.println("함수형 인터페이스 " + i);
        };
        lambda.method();

        Lmabda2 lmabda2 = (x) -> System.out.println(x);
        lmabda2.method(15);
        lmabda2 = (x) -> {
            int result = x + x ;
            System.out.println(result);
        };
        lmabda2.method(30);

        Lambda3 lambda3 = (a,b) -> a > b ? a : b;
        System.out.println("큰 수 (5,3) " +lambda3.max(5,3));
    }
}
