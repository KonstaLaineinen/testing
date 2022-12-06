public class CarMain {
    public CarMain() {
    }

    public static void main(String[] args) {
        carClass car1 = new carClass();
        carClass car2 = new carClass("Ferrari");
        car1.brand = "Fiat";
        car1.model = "500";
        car1.amountOfFuel = 10;
        car1.printData();
        car1.accelerate();
        car1.brake();
        car1.printData();
        car2.printData();



    }
}