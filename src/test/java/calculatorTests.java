import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorTests {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(6,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(16,4), 0.01);
    }

}
