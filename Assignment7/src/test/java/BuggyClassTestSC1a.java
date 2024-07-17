

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1a {

    private BuggyClass buggyClass;

    @Before
    public void setUp(){
        buggyClass = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass = null;
    }

    //Tests to achieve 100% statement coverage of buggyMethod1, but does not reveal the fault.
    @Test
    public void testBuggyClassMethodSC1a(){
        assertEquals(100, buggyClass.buggyMethod1(101, 10));
    }


}
