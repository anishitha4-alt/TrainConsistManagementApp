UC17
import java.util.Arrays;

public class TrainConsistManagementApp {

public class TrainConsistManagementApp {

UC18
    // ===== UC18: LINEAR SEARCH METHOD =====
    public static boolean linearSearch(String[] bogieIds, String searchId) {


        for (String id : bogieIds) {


            if (id.equals(searchId)) {
                return true;

    // ===== CUSTOM RUNTIME EXCEPTION =====
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
 main

    // ===== UC15 + UC16 already present =====
    // (keep your existing code unchanged)

    // ===== UC17: SORT USING ARRAYS.SORT =====
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

UC17
    public static void main(String[] args) {

        // ===== UC17 OUTPUT =====
        System.out.println("\n=================================");
        System.out.println("UC17 Sort Bogie Names Using Arrays.sort()");
        System.out.println("=================================\n");

        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Call built-in sort
        sortBogieNames(bogieNames);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");

    // ===== UC16: BUBBLE SORT METHOD =====
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop (passes)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop (comparisons)
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if out of order
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
 main
            }
        }

 UC18
        return false;
    }

    public static void main(String[] args) {

        System.out.println("\n=================================");
        System.out.println("UC18 Linear Search for Bogie ID");
        System.out.println("=================================\n");

         String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

         String searchId = "BG309";

         System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

         boolean found = linearSearch(bogieIds, searchId);

         if (found) {
            System.out.println("\n\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\n\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        // ===== UC15 =====
        System.out.println("=================================");
        System.out.println("UC15 Safe Cargo Assignment");
        System.out.println("=================================\n");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");

        // ===== UC16 =====
        System.out.println("\n=================================");
        System.out.println("UC16 Manual Sorting using Bubble Sort");
        System.out.println("=================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Call sorting method
        bubbleSort(capacities);

        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
 main
 main
    }
}