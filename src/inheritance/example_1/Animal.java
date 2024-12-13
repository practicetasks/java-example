package inheritance.example_1;

public class Animal {
    private double weight; // вес животного
    private int age; // возраст животного
    private int heartRate; // количество ударов сердца в минуту
    private boolean isWild; // является ли оно диким

    public Animal() {
        weight = 0.0;
        age = 0;
        heartRate = 100;
        isWild = true;
    }

    public String say() {
        return "Я животное!";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }
}
