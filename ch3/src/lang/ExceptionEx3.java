package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1. NullPointException
        String str = null;// 참조 타입(대문자 시작, 배열)에서 초기화할 때 null 사용 가능 int i = null 은 불가능
        Value v = null;
        // System.out.println(str); // null
        // if (str != null) {
        // System.out.println(str.length()); // NullPointException
        // }

        // 2. ArryIndexOutOfBoundsException
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);

        }

        // 3. NumberFormatException

        try {
            // exception 이 발생할 가능성이 있는 코드 작성
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            // Exception 발생하면 해야 할 작업 코드 작성
            // e.printStackTrace();// 추적
            // System.out.println(e.getMessage());// for input string : "a100"
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        }

        // 4. ClassCastException cast 안되는데 시도하면 생기는 오류
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);

    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } // ClassCastException 방지하는 법

    }
}
