package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    //Tests to see if the method returns the correct number of digits(7).
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    //Tests to see if the method returns the correct number of digits(0) when string is empty.
    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    //Tests to see if the method returns the null pointer exception when the string is null.
    @Test(expected = NullPointerException.class)
    public void testCountNumbers3() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }

    //Tests to see if the method returns the correct number of digits(1) when there is just one large number.
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("123456789");
        assertEquals(1, mycustomstring.countNumbers());
    }

    //Tests to see if the method returns the correct number of digits(9).
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("r2d2 is a r0b0t 4and 1ik35 c00k135");
        assertEquals(9, mycustomstring.countNumbers());
    }

    //Tests to see if the method returns the correct number of digits(4), when string starts and ends with digits.
    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("6    My numbers are 11 and 96     1");
        assertEquals(4, mycustomstring.countNumbers());
    }

    //Tests to see if the method returns the correct nth character.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    //Tests to see if the method returns the correct nth character.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    //Tests to see if the method returns the correct nth character when spaced out.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("heaIbfdAhasMlolFandRjsaAnedNlgtKas");
        assertEquals("IAMFRANK", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    //Tests to see if the method returns the correct illegal argument exception when n is 0.
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString("This test should throw illegalArgumentException");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    //Tests to see if the method returns the correct illegal argument exception when n is negative.
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("This test should throw illegalArgumentException also");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-35, false);
    }

    //Tests to see if the method returns the correct null pointer exception when the string is null and n is valid.
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true);
    }

    //Tests to see if the method returns the correct nth character when n is 1 and starts from the beginning.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("hello my name is frank and i am a computer scientist");
        assertEquals("hello my name is frank and i am a computer scientist", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    //Tests to see if the method returns the correct nth character when n is 1 and starts from the end.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("hello my name is frank and i am a computer scientist");
        assertEquals("hello my name is frank and i am a computer scientist", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    //Tests to see if the method returns the correct nth character when n is greater than the length of the string and start from beginning.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("should return empty string");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(35, false));
    }

    //Tests to see if the method returns the correct nth character when n is greater than the length of the string and starts from end.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString("should also return empty string");
        assertEquals("",  mycustomstring.getEveryNthCharacterFromBeginningOrEnd(50, true));
    }

    //Tests to see if the method returns the correct nth character when n is 2 and starts from beginning.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("more testing being done");
        assertEquals("oetsigbigdn", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    //Tests to see if the method returns the correct nth character when n is 5 and starts from beginning.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("this is test number 12 for nth character method");
        assertEquals("i  e nhte", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }

    //Tests to see if the method returns the correct nth character when n is 5 and starts from end.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("this is how you test with JUnit");
        assertEquals(" outhi", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    //Tests to see if the method returns the correct nth character when n is 8 and starts from beginning.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("this is finally the last test for this method!!!");
        assertEquals("tft re", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, true));
    }

    //Tests to see if the method returns the correct digit conversion when the digits are in the middle of the string.
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    //Tests to see if the correct illegal argument exception is thrown when the startpoint is greater than the endpoint
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("This should throw an IllegalArgumentException");
        mycustomstring.convertDigitsToNamesInSubstring(5,1);
    }

    //Tests to see if the correct index out of bounds exception is thrown when the starting point is 0.
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("This should throw a MyIndexOutOfBoundsException");
        mycustomstring.convertDigitsToNamesInSubstring(0, 10);
    }

    //Tests to see if the correct index out of bounds exception is thrown when the ending point is greater than the length of the string.
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("This should throw a MyIndexOutOfBoundsException");
        mycustomstring.convertDigitsToNamesInSubstring(2, 500);
    }

    //Tests to see if the correct index out of bounds exception is thrown when the starting point is negative and the ending point is greater than the length of the string.
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("This should throw a MyIndexOutOfBoundsException");
        mycustomstring.convertDigitsToNamesInSubstring(-3, 120);
    }

    //Tests to see if the correct null pointer exception is thrown when the string is null.
    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1,5);
    }

    //Tests to see if the correct converted string is returned when there is a valid starting point and end point.
    @Test
    public void testConvertDigitsToNamesInSubstring7() {
       mycustomstring.setString("123456");
       mycustomstring.convertDigitsToNamesInSubstring(3,4);
       assertEquals("12ThreeFour56", mycustomstring.getString());
    }

    //Tests to see if the correct converted string is returned when there is a valid starting point and end point and they are equal.
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("123456");
        mycustomstring.convertDigitsToNamesInSubstring(6,6);
        assertEquals("12345Six", mycustomstring.getString());
    }

    //Tests to see if the correct converted string is returned when there is a valid starting point and end point.
    @Test
    public void testConvertDigitsToNamesInSubstring9(){
        mycustomstring.setString("0123456789");
        mycustomstring.convertDigitsToNamesInSubstring(1,10);
        assertEquals("ZeroOneTwoThreeFourFiveSixSevenEightNine", mycustomstring.getString());
    }

    //Tests to see if the correct converted string is returned when there is a valid starting point and end point also isolating one digit in particular.
    @Test
    public void testConvertDigitsToNamesInSubstring10(){
        mycustomstring.setString("Why was 10 afraid of 7?");
        mycustomstring.convertDigitsToNamesInSubstring(22,23);
        assertEquals("Why was 10 afraid of Seven?", mycustomstring.getString());
    }

    //Tests to see if the correct converted string is returned when there is a valid starting point and end point with digits in the middle and end.
    @Test
    public void testConvertDigitsToNamesInSubstring11(){
        mycustomstring.setString("Because 7 8 9");
        mycustomstring.convertDigitsToNamesInSubstring(10,12);
        assertEquals("Because 7 Eight 9", mycustomstring.getString());
    }

}
