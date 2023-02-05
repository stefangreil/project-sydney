package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsCheckerTest {

    IsomorphicStringsChecker isomorphicStringsChecker;
    @BeforeEach
    void init(){
        isomorphicStringsChecker = new IsomorphicStringsChecker();
    }
    @Test
    void isIsomorphic() {
        boolean actual = isomorphicStringsChecker.isIsomorphic("egg", "add");
        assertTrue(actual);
    }

    @Test
    void isIsomorphicExample2() {
        boolean actual = isomorphicStringsChecker.isIsomorphic("foo", "bar");
        assertFalse(actual);
    }

    @Test
    void isIsomorphicExample3() {
        boolean actual = isomorphicStringsChecker.isIsomorphic("paper", "title");
        assertTrue(actual);
    }

    @Test
    void isIsomorphicExample4() {
        boolean actual = isomorphicStringsChecker.isIsomorphic("badc", "baba");
        assertFalse(actual);
    }
}