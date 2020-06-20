package pl.sda;

public class Dog extends Animal {
    //TODO: dlaczego?
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("hau hau");
    }
}
