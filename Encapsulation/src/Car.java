public class Car {

    // Encapsulation in Java is achieved by making a class's fields private.
    // Weaker encapsulation is achieved by making them protected.

    // Getter and setter in java are used to achieve encapsulation and data hiding.
    // They help the programmer control the access of important variables and how they
    // will be updated in a proper manner using conditions.
    // It also allows you to add validation or other logic to the getter and setter methods,
    // which can help to enforce business rules or constraints on the data being stored in the object.

    // Getters are used to retrieve the value of a field
    // Setters are used to set the value of a field.


    // Private fields
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Overloading constructor
    // It enables a single class to have more than one constructor that varies by the
    // list of parameters passed
    // In this case we have two constructors with different parameters
    Car(Car i) {
        this.copy(i);
    }

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // String representation of the object
    public String toString() {
        return "Make: " + make + "\n" +  "Model: " + model + "\n" + "Year: " + year;
    }

    //
    public void copy(Car i) {
        this.setMake(i.getMake());
        this.setModel(i.getModel());
        this.setYear(i.getYear());
    }
}
