package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayRunnerTest {

    SumArrayRunner sumArrayRunner;

    @BeforeEach
    public void init() {
        sumArrayRunner = new SumArrayRunner();
    }

    @Test
    void runningSumExample1() {
        int[] input = {1,2,3,4};
        int[] expected = {1,3,6,10};
        int[] actual = sumArrayRunner.runningSum(input);
        assertArrayEquals(expected, actual);
    }


    @Test
    void runningSumExample2() {
        int[] input = {1,1,1,1,1};
        int[] expected = {1,2,3,4,5};
        int[] actual = sumArrayRunner.runningSum(input);
        assertArrayEquals(expected, actual);
    }


    @Test
    void runningSumExample3() {
        int[] input = {3,1,2,10,1};
        int[] expected = {3,4,6,16,17};
        int[] actual = sumArrayRunner.runningSum(input);
        assertArrayEquals(expected, actual);
    }


    @Test
    void runningSumExample4() {
        int[] input = {1,1,-5,1};
        int[] expected = {1,2,-3,-2};
        int[] actual = sumArrayRunner.runningSum(input);
        assertArrayEquals(expected, actual);
    }
}