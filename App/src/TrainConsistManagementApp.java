public class TrainConsistManagementApp {

    // ===== UC18: LINEAR SEARCH METHOD =====
    public static boolean linearSearch(String[] bogieIds, String searchId) {


        for (String id : bogieIds) {


            if (id.equals(searchId)) {
                return true;
            }
        }

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
    }
}