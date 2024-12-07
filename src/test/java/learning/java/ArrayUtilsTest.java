package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    @Test
    void testFindMin() {
        int[] array = {3, 1, 4, 1, 5, 9};
        assertEquals(1, ArrayUtils.findMin(array));
    }

}