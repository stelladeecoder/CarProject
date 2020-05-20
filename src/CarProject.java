public class CarProject {

    //Average Car Properties (Primitive Data Types)
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn =false;
    char condition = 'A';

    public void printVariables(){
       System.out.println("The maximum speed of this car is: " + maxSpeed);
        System.out.println("The minimum speed of this car is: " + minSpeed);
        System.out.println("This car weighs " + weight + " pounds.");
        System.out.println("The car is on: " + isTheCarOn);
        System.out.println("The condition of this car is: " + condition);
    }

    public void wreckCar(){
        condition = 'C';
    }

    public static void main(String[] args) {
// instance
        CarProject familyCar = new CarProject();
       System.out.println("Family Car:");
        familyCar.printVariables();
        CarProject stellaCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Stella's Car:");
        stellaCar.printVariables();
    }
}
