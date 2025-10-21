package inheritance;

public class Carnivore extends Animal {
    // 육식동물
    String name;

    public Carnivore() {
        System.out.println("Carnivore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹는다");
    }

    public void print() {
        System.out.println(name + "육식동물");
    }
}
