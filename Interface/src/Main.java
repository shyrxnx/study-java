public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        Wolf wolf = new Wolf();
        Deer deer = new Deer();

        fish.flee();
        fish.hunt();
        wolf.hunt();
        deer.flee();

    }
}