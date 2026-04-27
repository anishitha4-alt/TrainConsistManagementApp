import java.util.Arrays;

public class TrainConsistManagementApp {

    // ===== UC15 + UC16 already present =====
    // (keep your existing code unchanged)

    // ===== UC17: SORT USING ARRAYS.SORT =====
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

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
    }
}