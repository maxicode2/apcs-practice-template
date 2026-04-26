import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WordCheckerTest {
    @Test(timeout = 1000)
    public void test1() {
        ArrayList<String> words = new ArrayList<>();
        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
        WordChecker wc = new WordChecker(words);

        
        ArrayList<String> expected = new ArrayList<>();
        expected.add("ch");
        expected.add("chacat");
        expected.add("");
        assertEquals("oops", expected , wc.createList("cat"));
    }

  @Test(timeout = 1000)
    public void test2() {
        ArrayList<String> words = new ArrayList<>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker wc = new WordChecker(words);

        
        assertTrue("oops" , wc.isWordChain());
    }
}
