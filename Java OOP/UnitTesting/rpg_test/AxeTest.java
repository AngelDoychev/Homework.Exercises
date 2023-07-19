package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

import java.util.IllformedLocaleException;

import static org.junit.Assert.*;

public class AxeTest {
    private final static int AXE_DAMAGE = 10;
    private final static int AXE_DURABILITY = 10;
    private final static int DUMMY_HEALTH = 10;
    private final static int DUMMY_XP = 10;
    private final static int BROKEN_AXE_DURABILITY = 0;
    private final static int LOSS = 1;
    private Dummy dummy;
    private Axe axe;
    private Axe brokenAxe;

    @Before
    public void setup() {
        this.brokenAxe = new Axe(AXE_DAMAGE, BROKEN_AXE_DURABILITY);
        this.axe = new Axe(AXE_DAMAGE, AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void weaponAttackLoosesDurability() {
        this.axe.attack(this.dummy);
        int durabilityAfterAttack = this.axe.getDurabilityPoints();
        Assert.assertEquals(AXE_DURABILITY - LOSS, durabilityAfterAttack);
    }
    @Test(expected = IllegalStateException.class)
    public void brokenWeaponCantAttack(){
        this.brokenAxe.attack(this.dummy);
    }

}
