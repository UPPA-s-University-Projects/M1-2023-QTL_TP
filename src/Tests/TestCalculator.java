package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Entity.Calculator;
import Interface.CalculatorService;

public class TestCalculator {
	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, c.perform(2,3));
	}
	
	@Test
	public void testPerform() {
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));
		verify(service).add(2,3);
	}
}
