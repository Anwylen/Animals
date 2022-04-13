import io.github.Anwylen.Abstractos.Animals;
import io.github.Anwylen.Interfaces.Tweetable;

public class Bird extends Animals implements Tweetable {

    public void tweet() {
        System.out.println("PioPio");

    }

    public void makeSound() {
        tweet();
    }

    public void sayName() {
        System.out.println("Paloma");

    }
}
