import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC3 {

    BuggyClass buggyClass;

    @Before
    public void setUp(){
        buggyClass = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClass = null;
    }

    //Doesn't reveal the fault and covers 50% of the branches (When x > 5).
    @Test
    public void test1BuggyClassMethodBC3(){
        assertEquals(7, buggyClass.buggyMethod3(7));
    }

    //Doesn't reveal the fault and covers the other 50% of the "branches" (When x < 5).
    @Test
    public void test2BuggyClassMethodBC3(){
        assertEquals(0, buggyClass.buggyMethod3(4));
    }

}
