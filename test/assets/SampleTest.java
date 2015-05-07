package assets;

import org.junit.Test;
import scala.math.Ordering;

import java.util.HashMap;
import java.util.Map;

public class SampleTest {

    @Test
    public void testOne() {
        System.out.println(add(1234, 123));
        System.out.println(add(34, 56));
        System.out.println(add(99, 99));
    }

    private int add(int a, int b) {
        if (b == 0) return a;
        if (a == 0) return b;
        return a ^ b;
    }
}
