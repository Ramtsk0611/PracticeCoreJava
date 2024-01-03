package com.practice.example.learning.designPattern.protoType;

// Prototype interface
interface Prototype {
    Prototype clone();
}

// Concrete prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }
}

// Client code
public class PrototypePatternExample {

    public static void main(String[] args) {
        // Creating a prototype
        Prototype originalPrototype = new ConcretePrototype("Original Object");

        // Cloning the prototype
        Prototype clonedPrototype = originalPrototype.clone();

        // Modifying the cloned object
        if (clonedPrototype instanceof ConcretePrototype) {
            ConcretePrototype concreteClone = (ConcretePrototype) clonedPrototype;
            concreteClone.setName("Cloned Object");
        }

        // Displaying original and cloned object names
        if (originalPrototype instanceof ConcretePrototype) {
            ConcretePrototype originalConcrete = (ConcretePrototype) originalPrototype;
            System.out.println("Original Object Name: " + originalConcrete.getName());
        }

        if (clonedPrototype instanceof ConcretePrototype) {
            ConcretePrototype clonedConcrete = (ConcretePrototype) clonedPrototype;
            System.out.println("Cloned Object Name: " + clonedConcrete.getName());
        }
    }
}

