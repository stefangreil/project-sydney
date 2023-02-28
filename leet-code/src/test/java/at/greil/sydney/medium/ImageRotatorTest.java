package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageRotatorTest {

    ImageRotator imageRotator;

    @BeforeEach
    void setUp() {
        imageRotator = new ImageRotator();
    }

    @Test
    void rotate() {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        imageRotator.rotate(input);
        assertArrayEquals(expected, input);

    }
}