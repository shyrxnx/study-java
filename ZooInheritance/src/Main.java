public class Main {
    public static void main(String[]args) {

        Animal animal1 = new Animal("Kitty", 10);
        Mammal mammal1 = new Mammal("Dog", 15, "Black");
        Bird bird1 = new Bird("Tweety", 4, 10);

        mammal1.eat();
        System.out.println(animal1.name);
        bird1.fly();

    }
}
