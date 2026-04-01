import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("=== UC2 add passenger to bogies to train  ===");
        System.out.println("=================================\n");


        ArrayList<String> passengerBogies = new ArrayList<>();


        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");


        System.out.println("Passenger Bogies after adding: " + passengerBogies);


        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removing AC Chair: " + passengerBogies);


        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Checking if Sleeper exists:");
        System.out.println("Contains Sleeper? " + exists);


        System.out.println("Final Train Passenger Consist: " + passengerBogies);
    }
}