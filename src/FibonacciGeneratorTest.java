import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    @org.junit.jupiter.api.Test
    void getFibRecursive() {
        assertEquals(8, FibonacciGenerator.getFibRecursive(6));
    }

    void getFib() {
        assertEquals(8, FibonacciGenerator.getFib(6));
    }
}