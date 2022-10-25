/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * main method that contains an object,
     * a decreed method, a method, and an annotation suppression.
     */

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

        Car car = new Car("Seicento",1340087.456);
        // deprecated method
        System.out.println("-------------------method1--------------------------------");
        car.printCarDetails();
        // method you will use
        System.out.println("-------------------method2--------------------------------");
        car.getCarDetails();
        System.out.println("----------------------------------------------------------");
    }
}
