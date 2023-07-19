package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTest {
    private final static int DUMMY_HEALTH = 10;
    private final static int DEAD_DUMMY_HEALTH = 0;
    private final static int DUMMY_XP = 10;
    private final static int AXE_DAMAGE = 10;
    private final static int AXE_DURABILITY = 10;
    private Dummy dummy;
    private Dummy deadDummy;
    private Axe axe;

    @Before
    public void setup() {
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
        this.deadDummy = new Dummy(DEAD_DUMMY_HEALTH, DUMMY_XP);
        this.axe = new Axe(AXE_DAMAGE, AXE_DURABILITY);
    }

    @Test
    public void dummyLoosesHealthIfAttacked() {
        this.axe.attack(dummy);
        int dummyHealthAfterAttack = this.dummy.getHealth();
        Assert.assertEquals(DUMMY_HEALTH - AXE_DAMAGE, dummyHealthAfterAttack);
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionIfAttacked() {
        this.axe.attack(deadDummy);
    }

    @Test
    public void deadDummyCanGiveXP() {
        int xpGained = this.deadDummy.giveExperience();
        Assert.assertEquals(xpGained, DUMMY_XP);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveXP() {
        this.dummy.giveExperience();
    }
}