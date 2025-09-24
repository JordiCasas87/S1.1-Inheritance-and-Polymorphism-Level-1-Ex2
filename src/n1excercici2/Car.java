package n1excercici2;

public class Car {

    private static final String BRAND = "Eagon";
    private static String model = "SuperNova 2000";
    private final int potency;

    public Car(int potency) {
        this.potency = potency;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String getModel() {
        return model;
    }


    public static String getBrand() {
        return BRAND;
    }

    public int getPotency() {
        return potency;
    }


    // brake and accelerate
    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }


    @Override
    public String toString() {
        return "Car [POTENCY=" + potency + " Brand " + BRAND + " model " + model + "]";
    }

}
