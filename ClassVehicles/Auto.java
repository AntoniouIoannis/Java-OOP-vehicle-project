package gr.aueb.cf6.ClassVehicles;

public class Auto {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();     // Creating instance - object  here!!! καλώντας την μέθοδο Vehicle.
        int capacityPasenger1;
        int luggageSpaceCapacity1;
        int enginePower1;

        car1.setVehID(1);
        car1.setBrand("Mitsubishi");
        car1.setModel("Lancer");
        car1.setTypeMachineFeed("Petrol");
        car1.setEngineCapacity("1500 cc.");
        car1.setConstrΕngineLayout("Straight Layout");
        car1.setNumberWheels(4);
        car1.setLength(4127);
        car1.setWidth(1215);
        capacityPasenger1 = 5;
        luggageSpaceCapacity1 = 280;
        enginePower1 = 107;



        Vehicle car2 = new Vehicle();     // Creating instance - object  here!!! καλώντας την μέθοδο Vehicle.
        int capacityPasenger2;
        int luggageSpaceCapacity2;
        int enginePower2;

        car2.setVehID(2);
        car2.setBrand("Mitsubishi");
        car2.setModel("Colt");
        car2.setTypeMachineFeed("Gas");
        car2.setEngineCapacity("1100 cc.");
        car2.setConstrΕngineLayout("Straight Layout");
        car2.setNumberWheels(4);
        car2.setLength(3127);
        car2.setWidth(1105);
        capacityPasenger2 = 5;
        luggageSpaceCapacity2 = 80;
        enginePower2 = 87;


        System.out.println("\nAuto 1:");
        System.out.println("id: " + car1.getVehID() + " - brand: " + car1.getBrand() + " - model: " + car1.getModel() + " - engine power: " + enginePower1);
        System.out.println("Auto 2:");
        System.out.println("id: " + car2.getVehID() + " - brand: " + car2.getBrand() + " - model: " + car2.getModel() + " - engine power: " + enginePower2);

        System.out.println("Vehicle count: " + Vehicle.getVehicleCount());

    }
}

//public class Vehicle {              // επίπεδο της κλάσης: Δημόσιο (Public fields)
//    1 .int vehID;                      // id
//    2. String brand;                   // Κατασκευαστής
//    3. String model;                   // Μοντέλο
//    4. String typeMachineFeed;         // Ηλεκτρικά / βενζινοκινητήρες / κινητήρες ντίζελ
//                                          petrol  oil  gas  electric  kerosene
//    5. String engineCapacity;          // Κυβικά μηχανής (π.χ. 1500 cc)
//    6. String constrΕngineLayout;      // Διάταξη κινητήρα (Διάταξη “V”, Ευθεία διάταξη / Επίπεδη Διάταξη(Μπόξερ)
//                                          “V” Layout, Straight Layout , Flat Layout (Boxer)
//    7. int numberWheels;               // Αριθμός τροχών
//    8. int length;                     // Μήκος Οχήματος
//    9. int width;                      // Πλάτος Οχήματος
