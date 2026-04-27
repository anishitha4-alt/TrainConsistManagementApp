  UC19
 
 UC18

 UC17

import static org.junit.Assert.assertArrayEquals;
 main
  main
  main
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrainConsistManagementAppTestCase {

  UC19
    @Test
    void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(TrainConsistManagementApp.binarySearch(arr, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};
        assertFalse(TrainConsistManagementApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG205"));
 
    @Test
  UC18
    void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(TrainConsistManagementApp.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(TrainConsistManagementApp.linearSearch(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainConsistManagementApp.linearSearch(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainConsistManagementApp.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(TrainConsistManagementApp.linearSearch(arr, "BG101"));
 
 UC17
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};

        TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};

        TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};

        TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};

        TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"Sleeper"},
                arr
        );

    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    void testSort_SingleElementArray() {
        int[] arr = {50};
        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{40, 40, 40}, arr);
 main
  main
      }
}