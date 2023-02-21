package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class SecondHighestTest {

    SecondHighest secondHighest;

    @BeforeEach
    void setUp() {
        secondHighest = new SecondHighest();
    }

    @Test
    void secondHighest() {
        int[] input = {33,5,4,7,1,0,-55,5,152,3000,2};
        int actual = secondHighest.secondHighest(input);
        assertEquals(152, actual);
    }

    @Test
    void secondHighest2() {
        int[] input = {5,1};
        int actual = secondHighest.secondHighest(input);
        assertEquals(1, actual);
    }

    @Test
    void secondHighest3() {
        int[] input = {1};
        int actual = secondHighest.secondHighest(input);
        assertEquals(-1, actual);
    }

    @Test
    void secondHighest4() {
        int[] input = {-33,-5,-4,-7,-1,0,-55,-5,-152,-3000,-2};
        int actual = secondHighest.secondHighest(input);
        assertEquals(-1, actual);
    }
}