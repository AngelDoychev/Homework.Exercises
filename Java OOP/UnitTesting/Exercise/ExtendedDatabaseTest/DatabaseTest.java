package UnitTestingExercise.p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;


import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Database database;
    private final static Integer[] NUMBERS = {2, 3, 4, 5};

    @Before
    public void setup() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }
    @Test
    public void testConstructorCreatesValidDatabase(){
        Integer[] databaseElements = database.getElements();
        Assert.assertArrayEquals(NUMBERS, databaseElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseThrowsExceptionWhenAddingMoreThan16Elements() throws OperationNotSupportedException {
        Integer[] emptyArr = new Integer[0];
        database = new Database(emptyArr);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionWhenAdding0Elements() throws OperationNotSupportedException {
        Integer[] emptyArr = new Integer[0];
        database = new Database(emptyArr);
    }

    @Test
    public void testAddElementAddsAnElementInTheNextFreeCell() throws OperationNotSupportedException {
        database.add(34);
        Integer[] elements = database.getElements();
        Assert.assertEquals(Integer.valueOf(34), elements[elements.length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddElementNullShouldThrowException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveShouldRemoveLastIndex() throws OperationNotSupportedException {
        Integer[] elementsBeforeRemove = database.getElements();
        database.remove();
        Integer[] elementsAfterRemove = database.getElements();
        Assert.assertEquals(elementsBeforeRemove.length - 1, elementsAfterRemove.length);
        Assert.assertEquals(elementsBeforeRemove[elementsBeforeRemove.length - 2], elementsAfterRemove[elementsAfterRemove.length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveElementFromEmptyDatabase() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }
}
