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
