public class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("The small fish is feeling from a predator.");
    }

    @Override
    public void hunt() {
        System.out.println("The big fish is hunting a prey.");
    }
}
