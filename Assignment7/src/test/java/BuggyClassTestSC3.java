import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC3 {

    BuggyClass buggyClass;

    @Before
    public void setUp(){
        buggyClass = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass = null;
    }

    //Has 100% Statement coverage, but less than 100% Branch coverage and reveals the fault
    // (Only goes through the "if (x>5)==true" branch).
    @Test
    public void test1BuggyClassMethodSC3(){
        assertEquals(0, buggyClass.buggyMethod3(6));
    }
}