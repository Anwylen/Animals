public class App {

    public static void main(String[] args) {

        Animals animals = new Cat();
        animals.makeSound();
        animals.sayName();

        animals = new Bird();
        animals.makeSound();
        animals.sayName();

        animals = new Dog();
        animals.makeSound();
        animals.sayName();


    }
}
