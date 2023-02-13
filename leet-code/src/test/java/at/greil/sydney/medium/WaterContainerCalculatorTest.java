package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterContainerCalculatorTest {

    WaterContainerCalculator waterContainerCalculator;
    @BeforeEach
    void init() {
        waterContainerCalculator = new WaterContainerCalculator();
    }
    @Test
    void maxArea() {
        int[] input = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, waterContainerCalculator.maxArea(input));
    }

    @Test
    void maxArea2() {
        int[] input = {1,1};
        assertEquals(1, waterContainerCalculator.maxArea(input));
    }

    @Test
    void maxArea3() {
        int[] input = {2,3,4,5,18,17,6};
        assertEquals(17, waterContainerCalculator.maxArea(input));
    }
}