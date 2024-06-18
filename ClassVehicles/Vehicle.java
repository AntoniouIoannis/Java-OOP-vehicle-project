package gr.aueb.cf6.ClassVehicles;

public class Vehicle {              // επίπεδο της κλάσης: Δημόσιο (Public fields)
    private static int vehicleCount = 0; // πόσα instances έχουν δημιουργηθεί απο όλα τα αρχεία.
    private int vehID;                      // id
    private String brand;                   // Κατασκευαστής
    private String model;                   // Μοντέλο
    private String typeMachineFeed;         // Ηλεκτρικά, Βενζινοκινητήρες, Ντίζελ, Κηροζίνη(Μαζούτ)
    private String engineCapacity;          // Κυβικά μηχανής (π.χ. 1500 cc)
    private String constrΕngineLayout;      // Διάταξη κινητήρα (Διάταξη “V”, Ευθεία διάταξη, Επίπεδη Διάταξη(Μπόξερ)
    private int numberWheels;               // Αριθμός τροχών
    private int length;                     // Μήκος Οχήματος
    private int width;                      // Πλάτος Οχήματος

    public Vehicle() {                      // Ο αρχικός δημιουργός(constructor)
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

//    // Constructor to initialize Vehicle objects
//    public Vehicle(int vehID, String brand, String model, String typeMachineFeed, String engineCapacity, String constrΕngineLayout, int numberWheels, int length, int width) {
//        this.vehID = vehID;
//        this.brand = brand;
//        this.model = model;
//        this.typeMachineFeed = typeMachineFeed;
//        this.engineCapacity = engineCapacity;
//        this.constrΕngineLayout = constrΕngineLayout;
//        this.numberWheels = numberWheels;
//        this.length = length;
//        this.width = width;
//        vehicleCount++;
//    }




    // Εδώ έχουμε package-private δλδ το πεδίο ή η μέθοδος είναι προσβάσιμα μόνο από άλλες κλάσεις στο ίδιο πακέτο.

    // Τώρα θα βάλουμε getters και setters όπου είναι μια καλή πρακτική -όταν τα πεδία είναι private-
    //  Αυτό επιτρέπει τον έλεγχο της πρόσβασης και της τροποποίησης των δεδομένων,
    //  διατηρώντας έτσι την ακεραιότητα της κλάσης.
    // Getters and Setters
    public int getVehID() {
        return vehID;
    }

    public void setVehID(int vehID) {
        this.vehID = vehID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeMachineFeed() {
        return typeMachineFeed;
    }

    public void setTypeMachineFeed(String typeMachineFeed) {
        this.typeMachineFeed = typeMachineFeed;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getConstrΕngineLayout() {
        return constrΕngineLayout;
    }

    public void setConstrΕngineLayout(String constrΕngineLayout) {
        this.constrΕngineLayout = constrΕngineLayout;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
