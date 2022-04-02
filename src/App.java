public class App {

    public static void main(String[] args) {

        Animals animals = new Cat();
        animals.MakeSound();
        animals.SayName();

        animals = new Bird();
        animals.MakeSound();
        animals.SayName();

        animals = new Dog();
        animals.MakeSound();
        animals.SayName();


    }
}
