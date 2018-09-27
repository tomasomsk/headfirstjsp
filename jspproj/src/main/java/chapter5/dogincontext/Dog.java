package chapter5.dogincontext;

import chapter8.propertyofproperty.Toy;

public class Dog {

    private String breed;
    private String name;
    private Toy[] toys;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Toy[] getToys() {
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }
}
