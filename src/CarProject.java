public class CarProject {

    //Average Car Properties (Primitive Data Types)
    int maxSpeed = 100;
    int minSpeed = 0;


    double weight = 4079;


    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Patty";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    public CarProject(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
    maxSpeed = customMaxSpeed;
    weight = customWeight;
    isTheCarOn = customIsTheCarOn;

    }

    // print out variables
    public void printVariables(){
       System.out.println("The maximum speed of this car is: " + maxSpeed);
        System.out.println("The minimum speed of this car is: " + minSpeed);
        System.out.println("This car weighs " + weight + " pounds.");
        System.out.println("The car is on: " + isTheCarOn);
        System.out.println("The condition of this car is: " + condition);
        System.out.println("Stella named the family car: " + nameOfCar);
    }
    //Stella got in a car accident
    public void wreckCar(){
        condition = 'C';
    }
    //Upgrade min speed
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    public void getIn() {
        //numberOfPeopleInCar = numberOfPeopleInCar + 1;
        numberOfPeopleInCar++;
    }

    public void  getOut() {
        //numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    // run the program
    public static void main(String[] args) {
        System.out.println("Birthday Car");
        CarProject birthdayPresent = new CarProject(500,5000.5, true );
        birthdayPresent.printVariables();

    System.out.println("My Car");
    CarProject myPresent = new CarProject(550, 2000, false);
    myPresent.printVariables();

    // instance

        /*CarProject familyCar = new CarProject();
       System.out.println("Family Car:");
        familyCar.printVariables();
        CarProject stellaCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Stella's Car:");
        stellaCar.printVariables(); */
    }
}
