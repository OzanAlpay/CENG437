package iyte.edu.year2016.ceng437.hw01.testSuit;

import static org.junit.Assert.*;

import org.junit.Test;
import iyte.edu.year2016.ceng437.hw01.Menu;
public class MenuTest {
	
	Menu menu = new Menu();
		
	@Test
	public void testReadPurchaseAmountNegativeValue() {
		
		menu.readPurchaseAmount();
		
	}

}
