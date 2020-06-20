package pl.sda;

public class Cat extends Animal {
    //TODO: dlaczego?
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miau miau");
    }
}
