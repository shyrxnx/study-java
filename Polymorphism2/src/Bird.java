public class Bird extends Animal {

    Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Chirp!";
    }

    @Override
    public String toString() {
        return "Bird named " + name + " says: " + makeSound();
    }

}