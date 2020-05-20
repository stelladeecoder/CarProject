public class CarProject {

    //Average Car Properties (Primitive Data Types)
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn =false;
    char condition = 'A';

    public void printVariables(){
       System.out.println(maxSpeed);
    }

    public static void main(String[] args) {
// instance
        CarProject familyCar = new CarProject();
        familyCar.printVariables();

    }
}
