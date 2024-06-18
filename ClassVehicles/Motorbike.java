package gr.aueb.cf6.ClassVehicles;

public class Motorbike {
    public static void main(String[] args) {

        Vehicle motorbike1 = new Vehicle();   // Creating instance - object  here!!! καλώντας την μέθοδο Vehicle.
        int enginePower1;

        motorbike1.setVehID(3);
        motorbike1.setBrand("Yamaha");
        motorbike1.setModel("ybr");
        motorbike1.setTypeMachineFeed("Petrol");
        motorbike1.setEngineCapacity("125 cc.");
        motorbike1.setConstrΕngineLayout("V Layout");
        motorbike1.setNumberWheels(2);
        enginePower1 = 10;


        System.out.println("\nMotorbike 1:");
        System.out.println("id: " + motorbike1.getVehID() + " - brand: " + motorbike1.getBrand() + " - model: " + motorbike1.getModel() + " - engine power: " + enginePower1);


        System.out.println("Vehicle count: " + Vehicle.getVehicleCount());

    }
}

//public class Vehicle {              // επίπεδο της κλάσης: Δημόσιο (Public fields)
//    private static int vehicleCount = 0; // πόσα instances έχουν δημιουργηθεί απο όλα τα αρχεία.
//    private int vehID;                      // id
//    private String brand;                   // Κατασκευαστής
//    private String model;                   // Μοντέλο
//    private String typeMachineFeed;         // Ηλεκτρικά, Βενζινοκινητήρες, Ντίζελ, Κηροζίνη(Μαζούτ)
//                                                  petrol  oil  gas  electric  kerosene
//    private String engineCapacity;          // Κυβικά μηχανής (π.χ. 1500 cc)
//    private String constrΕngineLayout;      // Διάταξη κινητήρα (Διάταξη “V”, Ευθεία διάταξη, Επίπεδη Διάταξη(Μπόξερ)
//                                               “V” Layout, Straight Layout , Flat Layout (Boxer)
//    private int numberWheels;               // Αριθμός τροχών
//    private int length;                     // Μήκος Οχήματος
//    private int width;                      // Πλάτος Οχήματος
