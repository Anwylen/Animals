public class Dog extends Animals implements Barkable {

    public void bark() {
        System.out.println("Guaauuu");
    }


    public void makeSound() {
        bark();
    }


    public void sayName() {
        System.out.println("Lobo");

    }
}
