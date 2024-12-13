package inheritance.example_2;

public class Coffee {
    protected double espresso;
    protected double milk;

    public Coffee() {
        espresso = 50.0;
        milk = 250.0;
    }

    public double mixAndGetVolume() {
        return espresso + milk;
    }
}

