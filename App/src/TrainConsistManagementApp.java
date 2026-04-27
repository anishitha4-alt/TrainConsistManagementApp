UC17
import java.util.Arrays;

public class TrainConsistManagementApp {

public class TrainConsistManagementApp {

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
            }
        }
    }

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
    }
}