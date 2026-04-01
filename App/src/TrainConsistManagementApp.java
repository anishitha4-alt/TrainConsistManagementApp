import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {


        System.out.println("=================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=================================\n");


        List<String> trainConsistList = new ArrayList<>();

        System.out.println("Train initialized successfully....");


        System.out.println("Initial Bogie Count: " + trainConsistList.size());


        System.out.println("Current Train Consist: " + trainConsistList);


        System.out.println("System ready for operation.");
    }
}