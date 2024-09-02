package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dogOne =new Dog();
        dogOne.breed="Husky";
        dogOne.name="Max";
        dogOne.color="Black";
        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dogTwo=new Dog();
        dogTwo.breed="Bulldog";
        dogTwo.name="Rodo";
        dogTwo.color="White";
        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dogThree=new Dog();
        dogThree.breed="Labrador";
        dogThree.name="Cubic";
        dogThree.color="Gray";
        // Call the methods 'bark()', 'run()', and 'play()' for each object
        dogOne.bark();
        dogOne.run();
        dogOne.paly();
        dogTwo.bark();
        dogTwo.run();
        dogTwo.paly();
        dogThree.bark();
        dogThree.run();
        dogThree.paly();



    }
}
