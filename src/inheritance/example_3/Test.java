package inheritance.example_3;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car("Toyota");
//        System.out.println(car.brand);
//
//        Car car1 = new Car("Nissan");
//        System.out.println(car1.brand);


        Animal objectAnimal = new Animal();
        objectAnimal.voice();
        System.out.println(objectAnimal);

        Animal animal2 = new Animal();
        animal2.voice();

        Vehicle vehicle = new Vehicle("", "", 23);
    }
}

class Vehicle {
    String brand;
    String model;
    int maxSpeed;

    Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void display() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Макс скорость: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int wheelsCount;

    Car(String brand, String model, int maxSpeed, int wheelsCount) {
        super(brand, model, maxSpeed);
        this.wheelsCount = wheelsCount;
    }

    void display() {
        System.out.println("Количество колес: " + wheelsCount);
        super.display();
    }
}



class Animal {
    void voice() {
        System.out.println(this);
    }
}

class Dog extends Animal {
    @Override
    void voice() {
        super.voice();
        System.out.println("Dog voice");
    }
}

class Cat extends Animal {
    void voice() {
        System.out.println("Cat voice");
    }
}