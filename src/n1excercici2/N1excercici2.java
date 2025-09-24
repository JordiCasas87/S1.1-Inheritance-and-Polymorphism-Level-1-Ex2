package n1excercici2;

public class N1excercici2 {

	public static void main(String[] args) {

       /* Answer:
        Static attributes belong to the class, not the object, so they are not set in the constructor.
        The non-static attribute 'potency' is final: if not initialized in the class, it must be set once in the constructor.
        If 'potency' is already initialized in the class, it cannot be included in the constructor because it is final.
        */

        Car car1 = new Car(145);
		Car car2 = new Car(300);

        System.out.println();
		System.out.println(car1.toString());

        // This method belongs to the object
        car1.accelerate();

        // This method is static, it belongs to the class
        Car.brake();

        // This setter is static, it is a setter of the class, not of the object.
        Car.setModel("DoraeSpeed");
		System.out.println();

        // We check that the model changes in all objects.
        System.out.println(car1.toString());  //exemple change SuperNova 2000 for DoraSpeed.
		System.out.println(car2.toString());

	}
}
