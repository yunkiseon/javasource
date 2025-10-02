package inheritance;

public class Parent {
    int age;
    String name;

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }

    public void list() {
        System.out.println("부모 클래스 ");
    }

}
