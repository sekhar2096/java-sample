import org.junit.Test;
import static org.junit.Assert.*;
import localdomain.localhost.tutorial.*;
public class MainTest {

    @Test
    public void testConcatenate() {
        Main mytest = new Main();

        String result = mytest.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
