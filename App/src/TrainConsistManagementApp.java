import java.util.Arrays;

public class TrainConsistManagementApp {

    // ===== UC19: BINARY SEARCH METHOD =====
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Ensure sorted (important for test case)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        System.out.println("\n=================================");
        System.out.println("UC19 Binary Search for Bogie ID");
        System.out.println("=================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String key = "BG309";

        // Ensure sorted before display
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("\n\nBogie " + key + " Found using Binary Search.");
        } else {
            System.out.println("\n\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}