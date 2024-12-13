package inheritance.example_1;

// Animal
// Canidae
// Fox

public class Fox extends Canidae {
    protected String color;

    public Fox() {
        setAge(23);
        color = "рыжий";
        setWeight(2.0);
    }

    public String getColor() {
        return color;
    }
}

