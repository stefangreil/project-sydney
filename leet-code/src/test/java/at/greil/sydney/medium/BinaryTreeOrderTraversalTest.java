package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeOrderTraversalTest {

    BinaryTreeOrderTraversal binaryTreeOrderTraversal;

    @BeforeEach
    void init() {
        binaryTreeOrderTraversal = new BinaryTreeOrderTraversal();
    }

    @Test
    void levelOrderExample1() {
        TreeNode input = new TreeNode(3,new TreeNode(9, null, null),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(9,20), Arrays.asList(15,7));
        assertEquals(expected, actual);
    }

    @Test
    void levelOrderExample2() {
        TreeNode input = new TreeNode(1);
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));
        assertEquals(expected, actual);
    }

    @Test
    void levelOrderExample3() {
        TreeNode input = new TreeNode();
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void levelOrderExample4() {
        TreeNode input = new TreeNode(1,new TreeNode(2), null);
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(2));
        assertEquals(expected, actual);
    }

    @Test
    void levelOrderExample5() {
        TreeNode input = new TreeNode(1,null, new TreeNode(2));
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(2));
        assertEquals(expected, actual);
    }

    @Test
    void levelOrderExample6() {
        TreeNode input = new TreeNode(1,new TreeNode(2, new TreeNode(4), null),new TreeNode(3,null,new TreeNode(5)));
        List<List<Integer>> actual = binaryTreeOrderTraversal.levelOrder(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(2,3), Arrays.asList(4,5));
        assertEquals(expected, actual);
    }
}