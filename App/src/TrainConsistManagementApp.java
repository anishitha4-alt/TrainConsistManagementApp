import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("=== UC5 Preserve insertion order of bogies ===");
        System.out.println("=================================\n");


        Set<String> formation = new LinkedHashSet<>();


        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");


        formation.add("Sleeper");


        System.out.println("Final train formation: " + formation);


        System.out.println("Note: LinkedHashSet preserves insertion order and removes duplicates automatically.");


        System.out.println("UC5 formation setup completed...");
    }
}