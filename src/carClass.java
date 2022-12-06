public class carClass {

    //Attributes
    public String brand;
    public String model;
    public int amountOfFuel;
    public int refuel = 5;


    //Default constructor
    public carClass(){
        brand="";
        model="";


    }

    public carClass(String brandName){
        brand=brandName;
        model="458";
        amountOfFuel = 30;

    }

    //Methods
    public void brake () {
        System.out.println("Car is braking");
    }


    public void accelerate () {
        System.out.println("Car is accelerating");
        amountOfFuel = amountOfFuel - 5;
        if (amountOfFuel == 0) {
            System.out.println("No petrol");
            System.exit (0);
        }
    }

    public void printData () {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel in tank: " + amountOfFuel);

    }
    public void refuel (int amount) {
        System.out.println("Fuel in tank: " + amountOfFuel);
        amountOfFuel = amountOfFuel + refuel;
        System.out.println("Refuel: 5");
        System.out.println("Fuel in tank after refill: " + amountOfFuel);
    }





}



