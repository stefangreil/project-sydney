package at.greil.sydney.easy;

import java.util.Random;

public class QuickSorter {
    public int[] sort(int[] numbers) {
        quicksort(numbers, 0,numbers.length-1);
        return numbers;
    }

    private static void quicksort(int[] numbers, int lowIndex, int highIndex) {

        if(lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, highIndex);

        int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

        quicksort(numbers, leftPointer+1, highIndex); //right Side
        quicksort(numbers, lowIndex, leftPointer-1); //left Side

    }

    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, highIndex, leftPointer); //swap pivot (from the end) to the right place in the array
        return leftPointer;
    }

    private static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }
}
