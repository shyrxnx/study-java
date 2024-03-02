public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog named " + name + " says: " + makeSound();
    }

}
