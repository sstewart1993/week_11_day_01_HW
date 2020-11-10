import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinks10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void drinksAll(){
        waterBottle.all();
        assertEquals(0, waterBottle.getVolume());
    }
//
    @Test
    public void reFill(){
        waterBottle.all();
        assertEquals(0, waterBottle.getVolume());
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
