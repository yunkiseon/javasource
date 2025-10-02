package inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Animal animal = new Animal();
        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();
        Herbivore herbivore = new Herbivore();
        herbivore = (Herbivore) animal;// <- 왼쪽이 자식
        herbivore.eat();
        // Animal animal = new Carnivore(); <- 왼쪽이 부모
        // ((Carnivore) animal).print();
        // animal.eat();

        // animal.print() 안됨. 자식한테 추가된 메소드를 적용할 수 없다.
        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore) carnivore2; 강제형변환을 해도 불가능하다.

        // animal = new Herbivore();
        // animal.eat();

    }
}
