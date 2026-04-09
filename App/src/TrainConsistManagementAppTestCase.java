import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTestCase {


    private List<TrainConsistManagementApp.Bogie> createData() {
        return Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 50),
                new TrainConsistManagementApp.Bogie("B", 70),
                new TrainConsistManagementApp.Bogie("C", 80)
        );
    }


    @Test
    void testLoopFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> bogies = createData();

        List<TrainConsistManagementApp.Bogie> result = new ArrayList<>();
        for (TrainConsistManagementApp.Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }

        assertEquals(2, result.size());
    }


    @Test
    void testStreamFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> bogies = createData();

        List<TrainConsistManagementApp.Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }


    @Test
    void testLoopAndStreamResultsMatch() {
        List<TrainConsistManagementApp.Bogie> bogies = createData();

        List<TrainConsistManagementApp.Bogie> loopResult = new ArrayList<>();
        for (TrainConsistManagementApp.Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        List<TrainConsistManagementApp.Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }


    @Test
    void testExecutionTimeMeasurement() {
        List<TrainConsistManagementApp.Bogie> bogies = createData();

        long start = System.nanoTime();

        bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }


    @Test
    void testLargeDatasetProcessing() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new TrainConsistManagementApp.Bogie("A", i % 100));
        }

        List<TrainConsistManagementApp.Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertNotNull(result);
    }
}