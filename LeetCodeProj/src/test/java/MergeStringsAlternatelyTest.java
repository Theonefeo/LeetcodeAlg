import org.leetcodealg.classes.MergeStringsAlternately;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeStringsAlternatelyTest {
    @Test
    void testMergeAlternately(){

        assertTrue("apbqcr".equals(MergeStringsAlternately.mergeAlternately("abc", "pqr")));
        assertTrue("apbqrs".equals(MergeStringsAlternately.mergeAlternately("ab", "pqrs")));

//        For OOP style writing code
//        MergeStringsAlternately mergedString2 = new MergeStringsAlternately("abcd", "pq");
//        assertTrue("apbqcd".equals(mergedString2.mergeAlternately()));
          assertTrue("apbqcd".equals(MergeStringsAlternately.mergeAlternately("abcd", "pq")));
    }
}
