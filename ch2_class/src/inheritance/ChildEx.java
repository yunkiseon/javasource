package inheritance;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Parent(5);
        Child child = new Child();
        Child2 child2 = new Child2();

        System.out.println(parent.age);
        System.out.println("child age " + child.age);
        child.play();
        child.list();
        child2.list();
        System.out.println("name " + child.name);

    }
}
