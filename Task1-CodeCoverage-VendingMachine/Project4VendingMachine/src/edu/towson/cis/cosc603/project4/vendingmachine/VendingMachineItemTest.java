/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Obed Dominguez
 *
 */
public class VendingMachineItemTest {
	
	/**
	 * Declaring necessary test objects for {@link VendingMachineItem}
	 */
	VendingMachineItem name, price;
	VendingMachineException expected;
	 
	
	/**
	 * Initializes the necessary test objects for the test cases to use. 
	 * @param VendingMachineException 
	 * 
	 * @throws Exception the exception
	 */
	
	@Before 
	public void setup() throws VendingMachineException{
		
		
	}
	
	/**
	 * Test for the VendingMachineItem () method of the {@link VendingMachineItem} class 
	 * @param <expected>
	 * 
	 */
	 
	@Test 
	public void testVendingMachineItem() throws Exception {
		String name = "";
		double price = 1.0;
		
		VendingMachineItem output = new VendingMachineItem (name, price);
		
		assertNotNull(output);
		assertEquals("", output.getName());
		assertEquals(1.0, output.getPrice(), 1.0);
	}
	
	/**
	 * 	Tests the VendingMachineItem () method of the {@link VendingMachineItem} class with the VendinMachineException message. 
	 * 
	 * @throws Exception
	 */
	@Test(expected=edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testVendingMachineItemException() throws Exception{
		String name = null;
		double price = -4.9E-324;
		
		VendingMachineItem output  = new VendingMachineItem(name, price);
		
		assertNotNull(output);
		
	}
	
	 

	/**
	 * Test for the getName() method of the {@link VendingMachineItem} class
	 * This is testing a string for the getName
	 */ 
	@Test
	public void getNametest() {
		VendingMachineItem test = new VendingMachineItem("", 0);
		
		String output = test.getName();
		
		assertEquals("", output);
	}
	
	/**
	 * Test for the getPrice() method of the {@link VendingMachineItem} class
	 * This is testing for a price of double value in the getPrice.  
	 */
		
	@Test
	public void getPriceTest() {
		VendingMachineItem test = new VendingMachineItem(null, 5);
		
		double output = test.getPrice();
		
		assertEquals(5, output, 4);
		
	}
	
	/**
	 * Cleans up test object after a test case is executed. 
	 */
	
	@After 
	public void tearDown(){
		name = null;
		price = null;
	}
}
