public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return "Cat named " + name + " says: " + makeSound();
    }

}