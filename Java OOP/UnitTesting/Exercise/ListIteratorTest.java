package UnitTestingExercise.p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {
    private ListIterator listIterator;
    private final static String[] ELEMENTS = {"Element1", "Element2"};

    @Before
    public void setup() throws OperationNotSupportedException {
        listIterator = new ListIterator(ELEMENTS);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowIfNull() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator(null);
    }
    @Test
    public void testConstructorShouldCreateIteratorSuccessfully() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator("String");
    }
    @Test
    public void testMoveShouldMove(){
        while (listIterator.hasNext()){
            Assert.assertTrue(listIterator.move());
        }
        Assert.assertFalse(listIterator.move());
    }
    @Test(expected = IllegalStateException.class)
    public void testPrintShouldThrowIfEmpty() throws OperationNotSupportedException {
        ListIterator emptyList = new ListIterator();
        emptyList.print();
    }
    @Test
    public void testPrintShouldPrintIndex() throws OperationNotSupportedException {
        ListIterator list = new ListIterator("String");
        Assert.assertEquals("String", list.print());
    }
}