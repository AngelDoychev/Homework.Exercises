package UnitTestingExercise.p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Database database;
    private final static Person angel = new Person(1, "Angel");

    @Before
    public void setup() throws OperationNotSupportedException {
        database = new Database(angel);
    }

    @Test
    public void testConstructorCreatesValidDatabase() {
        Person[] databaseElements = database.getElements();
        Assert.assertEquals(angel, databaseElements[0]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowIfMultipleUsersHaveSameID() throws OperationNotSupportedException {
        Person[] people = database.getElements();
        for (int i = 0; i < people.length; i++) {
            if (people[i].getId() == angel.getId()) {
                throw new OperationNotSupportedException();
            }
        }
    }

    @Test
    public void testAddShouldAddPersonSuccessfully() throws OperationNotSupportedException {
        Person newPerson = new Person(2, "Drug");
        database.add(newPerson);
        Assert.assertEquals(database.findByUsername("Drug").getId(), newPerson.getId());
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWithNull() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowIfMissing() throws OperationNotSupportedException {
        database.findById(2);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowIfMissing() throws OperationNotSupportedException {
        database.findByUsername("Nqkoi");
    }

    @Test
    public void testFindByUsernameShouldReturnUser() throws OperationNotSupportedException {
        Person person = database.findByUsername("Angel");
        Assert.assertEquals(angel.getId(), person.getId());
        Assert.assertEquals(angel.getUsername(), person.getUsername());
    }
}
