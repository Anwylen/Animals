import io.github.Anwylen.Abstractos.Animals;
import io.github.Anwylen.Interfaces.Meowable;

public class Cat extends Animals implements Meowable {

    public void meow() {
        System.out.println("Miauu");

    }

    public void makeSound() {
        meow();
    }

    public void sayName() {
        System.out.println("Moka");

    }
}
