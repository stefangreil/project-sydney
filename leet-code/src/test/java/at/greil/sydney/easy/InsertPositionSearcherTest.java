package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertPositionSearcherTest {

    InsertPositionSearcher insertPositionSearcher;

    @BeforeEach
    void setUp() {
        insertPositionSearcher = new InsertPositionSearcher();
    }

    @Test
    void searchInsert() {
        int[] input = {1,3,5,6};
        int actual = insertPositionSearcher.searchInsert(input, 5);
        assertEquals(2,actual);
    }

    @Test
    void searchInsertExample2() {
        int[] input = {1,3,5,6};
        int actual = insertPositionSearcher.searchInsert(input, 2);
        assertEquals(1,actual);
    }

    @Test
    void searchInsertExample3() {
        int[] input = {1,3,5,6};
        int actual = insertPositionSearcher.searchInsert(input, 7);
        assertEquals(4,actual);
    }

    @Test
    void searchInsertExample4() {
        int[] input = {2,30,35,46};
        int actual = insertPositionSearcher.searchInsert(input, 33);
        assertEquals(2,actual);
    }

    @Test
    void searchInsertExample5() {
        int[] input = {1};
        int actual = insertPositionSearcher.searchInsert(input, 0);
        assertEquals(0,actual);
    }

    @Test
    void searchInsertExample6() {
        int[] input = {1};
        int actual = insertPositionSearcher.searchInsert(input, 1);
        assertEquals(0,actual);
    }

    @Test
    void searchInsertExample7() {
        int[] input = {1,3};
        int actual = insertPositionSearcher.searchInsert(input, 2);
        assertEquals(1,actual);
    }
}