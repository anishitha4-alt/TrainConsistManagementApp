import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("=== UC4 Maintain Ordered bogie consist ===");
        System.out.println("=================================\n");


        List<String> trainConsist = new LinkedList<>();


        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);


        trainConsist.add(2, "Pantry Car");

        System.out.println("After inserting 'Pantry Car' at position 2: " + trainConsist);


        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("After removing first and last bogie: " + trainConsist);


        System.out.println("UC4 ordered consist operations completed...");
    }
}