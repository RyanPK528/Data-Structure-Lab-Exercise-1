public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    // Polymorphism: Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The lion roars!");
    }
}
