
package lab.solution;


public class Car {
    
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

   
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0; // Starting mileage is 0
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

   
    public void drive(double km) {
        double fuelNeeded = km / 10.0;

        if (fuelNeeded > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= fuelNeeded;
            System.out.println("Driving " + km + " km... (Used " + fuelNeeded + " liters)");
        }
    }

    
    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
            System.out.println("Refueling " + amount + " liters... Current fuel: " + fuelLevel + " liters.");
        }
    }

   
    public void checkStatus() {
        System.out.println("--- Car Status ---");
        System.out.println("Car: " + model + " (" + plateNumber + ")");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Fuel Level: " + fuelLevel + " / " + tankCapacity + " L");

        if (fuelLevel < 0.10 * tankCapacity) {
            System.out.println("Low fuel warning!");
        }
        System.out.println("------------------");
    }
}
