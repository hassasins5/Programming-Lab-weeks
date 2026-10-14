
package lab.solution;


public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("38 ABC 123", "Toyota Corolla", 15.0, 50.0);

       
        myCar.checkStatus();

        
        System.out.println("\n[Test 1: Normal Drive]");
        myCar.drive(100);
        myCar.checkStatus();

        
        System.out.println("\n[Test 2: Driving to trigger low fuel warning]");
        myCar.drive(20); 
        myCar.checkStatus();

        
        System.out.println("\n[Test 3: Edge Case - Not enough fuel]");
        System.out.println("Attempting to drive 100 km (requires 10L, but only 3L available):");
        myCar.drive(100); 

        
        System.out.println("\n[Test 4: Normal Refueling]");
        myCar.refuel(20); 
        myCar.checkStatus();

       
        System.out.println("\n[Test 5: Edge Case - Exceeding Tank Capacity]");
        System.out.println("Attempting to add 40 liters (23L + 40L = 63L > 50L capacity):");
        myCar.refuel(40); 
        myCar.checkStatus();
    }
}