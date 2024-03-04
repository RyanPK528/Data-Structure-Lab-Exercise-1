public class Main {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal animal = new Animal("Generic Animal", 5);

        // Accessing methods of the Animal class
        System.out.println("Animal's name: " + animal.getName());
        System.out.println("Animal's age: " + animal.getAge());
        animal.makeSound();

        // Creating an instance of Lion
        Lion lion = new Lion("Simba", 3);

        // Accessing methods of the Lion class
        System.out.println("\nLion's name: " + lion.getName());
        System.out.println("Lion's age: " + lion.getAge());
        lion.makeSound();
    }
}
