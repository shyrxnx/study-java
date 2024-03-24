public class Mammal extends Animal {

    String furColor;

    Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    void giveBirth() {
        System.out.println("The mammal is giving birth...");
    }

}
