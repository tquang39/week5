package Animal;

public class Cat extends Mamaml {
    Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
