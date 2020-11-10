import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.paperCount());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.toner());
    }

    @Test
    public void usesPaper(){
        assertEquals(40, printer.usePaper(10));
    }

    @Test
    public void usesToner(){
        assertEquals(80, printer.useToner(20));
    }


}
