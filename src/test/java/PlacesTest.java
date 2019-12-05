import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import gameassets.places.WheatFarm;
import gameassets.places.ChickenFarm;
import gameassets.places.CowFarm;

public class PlacesTest {
    WheatFarm wheatFarm;
    ChickenFarm chickenFarm;
    CowFarm cowFarm;

    /**
     * Constructor for places test.
     * Initialize a new wheatfarm object to test wheatFarm methods.
     * Initialize a new chickenfarm object to test chickenFarm methods.
     * Initialize a new cowfarm object to test cowfarm methods.
     */
    public PlacesTest() {
        wheatFarm = new WheatFarm();
        chickenFarm = new ChickenFarm();
        cowFarm = new CowFarm();
    }

    @Test
    public void getSeeds() {
        wheatFarm.buySeeds();
        assertEquals(wheatFarm.getSeeds(),1);
    }

    @Test
    public void getSeedlings() {
        wheatFarm.buySeeds();
        wheatFarm.growSeedlings();
        assertEquals(wheatFarm.getSeedlings(), 0);
    }

    @Test
    public void buySeeds() {
        wheatFarm.buySeeds();
        assertEquals(wheatFarm.getSeeds(), 1);
    }

    @Test
    public void hasSeeds() {
        wheatFarm.buySeeds();
        assert wheatFarm.hasSeeds();
    }

    @Test
    public void sellGrain() {
        wheatFarm.sell();
        assertEquals(wheatFarm.getGrain(), 0);
    }

    @Test
    public void hasGrain() {
        wheatFarm.sell();
        assert !wheatFarm.hasGrain();
    }

    @Test
    public void plantSeeds() {
        int seeds = wheatFarm.getSeeds();
        wheatFarm.plantSeeds();
        assertEquals(wheatFarm.getSeedlings(), seeds);
    }

    @Test
    public void growSeedlings() {
        int seedlings = wheatFarm.getSeedlings();
        wheatFarm.growSeedlings();
        assertEquals(wheatFarm.getWheat(), seedlings);
    }

    @Test
    public void hasWheat() {
        wheatFarm.buySeeds();
        wheatFarm.plantSeeds();
        wheatFarm.growSeedlings();
        assert wheatFarm.hasWheat();
    }

    @Test
    public void getWheat() {
        wheatFarm.buySeeds();
        wheatFarm.plantSeeds();
        wheatFarm.growSeedlings();
        assertEquals(wheatFarm.getWheat(), 1);
    }

    @Test
    public void getGrain() {
        wheatFarm.buySeeds();
        wheatFarm.plantSeeds();
        wheatFarm.growSeedlings();
        wheatFarm.harvestWheat();
        assertEquals(wheatFarm.getGrain(), 1);
    }

    @Test
    public void harvestWheat() {
        int wheat = wheatFarm.getWheat();
        wheatFarm.harvestWheat();
        assertEquals(wheatFarm.getGrain(), wheat);
    }

    @Test
    public void buyChicken() {
        chickenFarm.buyChicken();
        assertEquals(chickenFarm.getChicken(), 1);
    }

    @Test
    public void hasChicken() {
        chickenFarm.buyChicken();
        assert chickenFarm.hasChicken();
    }

    @Test
    public void getChicken() {
        chickenFarm.buyChicken();
        assertEquals(chickenFarm.getChicken(), 1);
    }

    @Test
    public void getFullChicken() {
        chickenFarm.buyChicken();
        chickenFarm.layEggs();
        chickenFarm.getFullChicken();
    }

    @Test
    public void getEgg() {
        chickenFarm.buyChicken();
        chickenFarm.layEggs();
        chickenFarm.collectEgg();
        chickenFarm.getEgg();
    }

    @Test
    public void hasEgg() {
        chickenFarm.buyChicken();
        chickenFarm.layEggs();
        chickenFarm.collectEgg();
        assert chickenFarm.hasEgg();
    }

    @Test
    public void hasFullChicken() {
        chickenFarm.buyChicken();
        chickenFarm.layEggs();
        assert chickenFarm.hasFullChicken();
    }

    @Test
    public void sellEggs() {
        chickenFarm.sell();
        assertEquals(chickenFarm.getEgg(), 0);
    }

    @Test
    public void layEggs() {
        int chicken = chickenFarm.getChicken();
        chickenFarm.layEggs();
        assertEquals(chickenFarm.getFullChicken(), chicken);
    }

    @Test
    public void collectEgg() {
        int fullChicken = chickenFarm.getFullChicken();
        chickenFarm.collectEgg();
        assertEquals(chickenFarm.getEgg(), fullChicken);
        assertEquals(chickenFarm.getFullChicken(), 0);
    }

    @Test
    public void getCow() {
        cowFarm.buyCow();
        assertEquals(cowFarm.getCow(), 1);
    }

    @Test
    public void getFullCow() {
        cowFarm.buyCow();
        cowFarm.growCow();
        assertEquals(cowFarm.getFullCow(), 1);
    }

    @Test
    public void hasFullCow() {
        cowFarm.buyCow();
        cowFarm.growCow();
        assert cowFarm.hasFullCow();
    }

    @Test
    public void getMilk() {
        cowFarm.buyCow();
        cowFarm.growCow();
        cowFarm.milkCow();
        assertEquals(cowFarm.getMilk(), 1);
    }

    @Test
    public void hasCow() {
        cowFarm.buyCow();
        assert cowFarm.hasCow();
    }

    @Test
    public void hasfullCow() {
        cowFarm.buyCow();
        cowFarm.growCow();
        assertEquals(cowFarm.getFullCow(), 1);
    }

    @Test
    public void hasMilk() {
        cowFarm.buyCow();
        cowFarm.growCow();
        cowFarm.milkCow();
        assert cowFarm.hasMilk();
    }

    @Test
    public void buyCow() {
        cowFarm.buyCow();
        assertEquals(cowFarm.getCow(), 1);
    }

    @Test
    public void milkCow() {
        int fullCow = cowFarm.getFullCow();
        cowFarm.milkCow();
        assertEquals(fullCow, cowFarm.getMilk());
    }

    @Test
    public void growCow() {
        int cow = cowFarm.getCow();
        cowFarm.growCow();
        assertEquals(cowFarm.getFullCow(), cow);
    }

    @Test
    public void sellCow() {
        cowFarm.sellCow();
        assertEquals(cowFarm.getCow(), 0);
    }

    @Test
    public void sellMilk() {
        cowFarm.sell();
        assertEquals(cowFarm.getMilk(), 0);
    }

}
