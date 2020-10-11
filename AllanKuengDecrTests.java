package ch.hsr.se1.calculator.logic.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ch.hsr.se1.calculator.logic.RPNCalculator;

public class AllanKuengDecrTests {
	private final RPNCalculator rpnc = new RPNCalculator();

    @Test
    void Decrement() throws Exception {
        rpnc.push("0");
        rpnc.push("AllanKuengDecr");
        assertEquals(1, rpnc.getCurrentStack().length);
        assertEquals(-1, rpnc.getCurrentStack()[0]);
    }

}
