package inheritance.example_2;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee.milk);

        Cappuccino cappuccino = new Cappuccino();
//        System.out.println("Объём молочной пены - " + cappuccino.getMilkFoam());
        System.out.println(cappuccino.milk);

        Cappuccino otherCappuccino = new Cappuccino();
        System.out.println(otherCappuccino.milk);

        System.out.println(coffee.milk);

    }
}
