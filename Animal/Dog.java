package Animal;

public class Dog extends Mamaml {

    Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog another) {
        System.out.print("Woooof");
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
