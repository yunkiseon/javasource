package util;

public class FruitBoxEx1 {
    public static void main(String[] args) {

        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        // appleBox.add(new Grape()); -> 는 안된다. Apple로 지정해놓았기 때문이다.
        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        Juicer.makJuice(fruitBox);
        Juicer.makJuice(grapeBox);
        Juicer.makJuice(appleBox);
        // Juicer.makJuice(toyBox); -> x
    }
}
