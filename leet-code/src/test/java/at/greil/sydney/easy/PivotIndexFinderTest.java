package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndexFinderTest {

    PivotIndexFinder pivotIndexFinder;

    @BeforeEach
    void init(){
        pivotIndexFinder = new PivotIndexFinder();
    }

    @Test
    void pivotIndexExample() {
        int[] input = {1,7,3,6,5,6};
        var actual = pivotIndexFinder.pivotIndex(input);
        assertEquals(3, actual);

    }

    @Test
    void pivotIndexExample2() {
        int[] input = {1,2,3};
        var actual = pivotIndexFinder.pivotIndex(input);
        assertEquals(-1, actual);

    }

    @Test
    void pivotIndexExample3() {
        int[] input = {2,1,-1};
        var actual = pivotIndexFinder.pivotIndex(input);
        assertEquals(0, actual);

    }

    @Test
    void pivotIndexExample4() {
        int[] input = {2,1,-1};
        var actual = pivotIndexFinder.pivotIndex(input);
        assertEquals(0, actual);

    }

    @Test
    void pivotIndexExample5() {
        int[] input = {-1,-1,-1,-1,-1,-1};
        var actual = pivotIndexFinder.pivotIndex(input);
        assertEquals(-1, actual);

    }
}