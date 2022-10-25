/**
 * @author Drumstyle92
 * class that contains variables, constructor method, a deprecated method and a method.
 */
public class Car {
    /**
     * machine model.
     */
    private String modelName;
    /**
     * mileage of the car.
     */
    private double modelage;
    /**
     *
     * @param modelName parameter that is filled with the model of the machine.
     * @param modelage parameter to be filled with the kilometers of the car.
     * constructor of the class it belongs to.
     */
    public Car(String modelName,double modelage){
        this.modelName = modelName;
        this.modelage = modelage;
    }
    /**
     * @deprecated
     * old method that prints the machine variables.
     */
    @Deprecated
    public void printCarDetails(){
        System.out.printf("The car model is %s and has %s kilometers\n",this.modelName,this.modelage);
    }

    /**
     * new method that shows the machine variables.
     */
    public void getCarDetails(){
        System.out.println("The car model: " + this.modelName + "\nThe machine has traveled: " + this.modelage);
    }
}
