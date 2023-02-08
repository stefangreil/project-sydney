package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesGeneratorTest {

    ParenthesesGenerator parenthesesGenerator;

    @BeforeEach
    void init() {
        parenthesesGenerator = new ParenthesesGenerator();
    }


    @Test
    void generateParenthesis5() {
        List<String> actual = parenthesesGenerator.generateParenthesis(5);
        assertLinesMatch(Arrays.asList(
                "((((()))))", "(((()())))", "(((())()))", "(((()))())", "(((())))()", "((()(())))",
                "((()()()))", "((()())())", "((()()))()", "((())(()))", "((())()())", "((())())()",
                "((()))(())", "((()))()()", "(()((())))", "(()(()()))", "(()(())())", "(()(()))()",
                "(()()(()))", "(()()()())", "(()()())()", "(()())(())", "(()())()()", "(())((()))",
                "(())(()())", "(())(())()", "(())()(())", "(())()()()", "()(((())))", "()((()()))",
                "()((())())", "()((()))()", "()(()(()))", "()(()()())", "()(()())()", "()(())(())",
                "()(())()()", "()()((()))", "()()(()())", "()()(())()", "()()()(())", "()()()()()"
        ), actual);
    }

    @Test
    void generateParenthesis4() {
        List<String> actual = parenthesesGenerator.generateParenthesis(4);
        assertLinesMatch(Arrays.asList(
                "(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()",
                "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"
        ), actual);
    }

    @Test
    void generateParenthesis3() {
        List<String> actual = parenthesesGenerator.generateParenthesis(3);
        assertLinesMatch(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), actual);
    }

    @Test
    void generateParenthesis2() {
        List<String> actual = parenthesesGenerator.generateParenthesis(2);
        assertLinesMatch(Arrays.asList("(())", "()()"), actual);
    }

    @Test
    void generateParenthesis1() {
        List<String> actual = parenthesesGenerator.generateParenthesis(1);
        assertLinesMatch(Arrays.asList("()"), actual);
    }
}