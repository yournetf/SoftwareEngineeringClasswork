import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1b {

    private BuggyClass buggyClass;

    @Before
    public void setUp(){
        buggyClass = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass = null;
    }

    //Tests to achieve less than a 50% statement coverage of buggyMethod1, but still reveals the fault.
    @Test
    public void testBuggyClassMethodSC1b(){
        assertEquals(0, buggyClass.buggyMethod1(12, 12));
    }


}
