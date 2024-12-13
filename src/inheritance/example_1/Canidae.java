package inheritance.example_1;

public class Canidae extends Animal { // здесь происходит наследование
    protected boolean isPredator;

    public Canidae() {
        isPredator = true;
    }

    public String growl() {
        return "Р-р-р-р-р!";
    }
}
