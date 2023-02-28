package at.greil.sydney.medium;

import java.util.Stack;

public class ImageRotator {

    public void rotate(int[][] matrix) {
        Stack<Integer> temp = new Stack<>();
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = 0; j <= matrix.length-1; j++) {
                temp.add(matrix[i][j]);
            }
        }
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = matrix.length-1; j >= 0; j--) {
                matrix[j][i] = temp.pop();
            }
        }
    }
}
