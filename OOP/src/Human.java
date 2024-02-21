public class Human {

    String name;
    int age;
    String race;
    String colorOfEyes;
    float height;
    float weight;

    Human(String name, int age, String race, String colorOfEyes, float height) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.colorOfEyes = colorOfEyes;
        this.height = height;
    }

    //Overloading constructors
    //It is a technique that enables a single class to have more than one constructor that varies
    // by the list of arguments passed.
    Human(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

}
