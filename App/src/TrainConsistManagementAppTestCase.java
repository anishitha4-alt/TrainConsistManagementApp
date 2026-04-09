import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTestCase {


    private List<TrainConsistManagementApp.Bogie> filterBogies(
            List<TrainConsistManagementApp.Bogie> bogies, int threshold) {

        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .toList();
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 80),
                new TrainConsistManagementApp.Bogie("B", 90),
                new TrainConsistManagementApp.Bogie("C", 60)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 70),
                new TrainConsistManagementApp.Bogie("B", 80)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertEquals(1, result.size()); // 70 should NOT be included
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 50),
                new TrainConsistManagementApp.Bogie("B", 60)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 80),
                new TrainConsistManagementApp.Bogie("B", 85),
                new TrainConsistManagementApp.Bogie("C", 90),
                new TrainConsistManagementApp.Bogie("D", 60)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertEquals(3, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 40),
                new TrainConsistManagementApp.Bogie("B", 50)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.Bogie("A", 80),
                new TrainConsistManagementApp.Bogie("B", 85),
                new TrainConsistManagementApp.Bogie("C", 90)
        );

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertEquals(bogies.size(), result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("A", 80));
        bogies.add(new TrainConsistManagementApp.Bogie("B", 60));

        int originalSize = bogies.size();

        List<TrainConsistManagementApp.Bogie> result = filterBogies(bogies, 70);

        assertEquals(originalSize, bogies.size()); // unchanged
        assertEquals(2, bogies.size());
    }
}