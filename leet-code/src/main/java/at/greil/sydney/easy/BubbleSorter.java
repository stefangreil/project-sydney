package at.greil.sydney.easy;

public class BubbleSorter {
    public int[] sort(int[] numbers) {

        var stillUnsorted = true;
        while (stillUnsorted) {
            stillUnsorted = false;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]) {
                    stillUnsorted = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }

        return numbers;
    }
}
