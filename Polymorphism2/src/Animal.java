
public class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Oooff";
    }

    public String toString() {
        return "Animal named " + name + " says: " + makeSound();
    }
}
