package ss07_abstract_interface.practice.practice1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck";
    }

    public String howToEat(){
        return "could be fried";
    }
}
