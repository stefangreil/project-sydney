package at.greil.sydney.medium;

/**
 * 11. Container With Most Water
 */
public class WaterContainerCalculator {

    public int maxArea(int[] height) {
        if(height.length > 50000) return -1;
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int water = 0;
            for (int j = 0; j < height.length; j++) {
                int actualWater = 0;
                if (height[i] >= height[j]) {
                    actualWater = height[j] * (j - i);
                } else {
                    actualWater = height[i] * (j - i);
                }
                if (actualWater < 0) actualWater = actualWater * -1;
                if (actualWater > water) water = actualWater;
            }
            if (water > result) result = water;
        }
        return result;
    }

}
