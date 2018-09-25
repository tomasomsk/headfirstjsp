package chapter8.propertyofproperty;

import chapter5.dogincontext.Dog;

public class Person {

    String name;
    Dog dog;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
