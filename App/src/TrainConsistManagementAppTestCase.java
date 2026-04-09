import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTestCase {


    @Test
    void testException_ValidCapacityCreation() throws Exception {
        TrainConsistManagementApp.PassengerBogie b =
                new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);

        assertNotNull(b);
    }


    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception e = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("AC", -10)
        );

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }


    @Test
    void testException_ZeroCapacityThrowsException() {

        Exception e = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("AC", 0)
        );

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }


    @Test
    void testException_ExceptionMessageValidation() {

        Exception e = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("AC", -1)
        );

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }


    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {

        TrainConsistManagementApp.PassengerBogie b =
                new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", b.getType());
        assertEquals(72, b.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {

        TrainConsistManagementApp.PassengerBogie b1 =
                new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);

        TrainConsistManagementApp.PassengerBogie b2 =
                new TrainConsistManagementApp.PassengerBogie("AC", 60);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}