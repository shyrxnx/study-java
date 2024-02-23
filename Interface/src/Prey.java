public interface Prey {
    // Interface - a blueprint for a set of related methods that a class must implement.
    // It defines a contract or a set of rules that a class must follow. However, unlike a class,
    // an interface cannot provide any implementation for its methods; it only declares the
    // methods that must be implemented by the classes that implement the interface.

    // Inheritance creates a hierarchical relationship between classes, allowing subclasses to
    // inherit attributes and behaviors from a superclass, whereas interfaces define a
    // contract for classes to implement specific behaviors without prescribing
    // any implementation details.

    // The number of interfaces a class can implement is typically not limited, allowing
    // for multiple interfaces to be implemented by a single class, while in single
    // inheritance models, a class can generally extend only one superclass.

    void flee();


}
