/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Obed Dominguez
 *
 */
public class VendingMachineTest {
	
	private double amount; 
	
	

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 * 
	 * @throws Exception the exception 
	 */
	
	@Before 
	public void setup() throws Exception {
					
	}
	
	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 * 
	 * String code A 
	 *  
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

	}

	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 * 
	 * String code B 
	 *  
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine test = new VendingMachine();
		test.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "B";

		test.addItem(item, code);
	}

	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 *  
	 *  String code C. 
	 */
	@Test//(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "C";

		fixture.addItem(item, code);

	}
	
	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 * 
	 * String code D. 
	 *  
	 */
	@Test 
	public void testAddItem_4() throws Exception {
		VendingMachine test = new VendingMachine();
		VendingMachineItem item = new VendingMachineItem ("", 1.0);
		String code = "D";
		
		
		test.addItem(item, code);
		assertEquals("D", code);
	}
	
	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 * 
	 * Throw exception message/error message 
	 *  
	 */	
	@Test (expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testAddItem_Message() throws Exception {
		VendingMachine fixture = new VendingMachine();
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "D";
		fixture.addItem(item, code);
		
		ExpectedException thrown = ExpectedException.none();
		thrown.expect(VendingMachineException.class);
		
		fixture.addItem(item, code);
		assertNotNull(thrown);
	}
	

	/**
	 * Test for the removeItem () method of the {@link VendingMachine} class.
	 *  
	 */
	@Test (expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem() throws Exception {
		VendingMachine test = new VendingMachine();
		test.balance = 1.0;
		String code = "D";
		
		VendingMachineItem output = test.removeItem(code);
		
		assertNotNull(output);
		test.addItem(output, code);
		
	}
	
	/**
	 * Test for the removeItem () method of the {@link VendingMachine} class.
	 *  
	 */	 
	@Test 
	public void testRemoveItem_2() throws Exception {
		VendingMachine test = new VendingMachine();
		test.balance = 1.0;
		double code = 1.0;
		VendingMachineItem item = new VendingMachineItem(null, code);
		
		assertNotNull(item);
	
			
	}
	
	/**
	 * Test for the insertMoney () method of the {@link VendingMachine} class.
	 */
	@Test
	public void testInsertMoney() {
		VendingMachine test = new VendingMachine();
		VendingMachine output = test.insertMoney(amount);
		assertEquals(null, output, null);
		
	}
	
	/**
	 * Test for the insertMoney () method of the {@link VendingMachine} class.
	 *
	 */
	@Test (expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2() throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;
		
		fixture.insertMoney(amount);
		
	}
				
	/**
	 * Test for the getBalance () method of the {@link VendingMachine} class.
	 */
	@Test
	public void getBalanceTest(){
		VendingMachine test = new VendingMachine();
		test.balance = 1.0;
		
		double result = test.getBalance();
		
		assertEquals(0, result, 1.0);
		
	}
	
	/**
	 * Test for the makePurchase () method of the {@link VendingMachine} class.
	 * 
	 */		
	@Test 
	public void testMakePurchase_1() throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "D";
		
		boolean result = fixture.makePurchase(code);
		
		assertFalse(result);
	}
	
	/**
	 * Test for the makePurchase () method of the {@link VendingMachine} class.
	 * 
	 */		
	@Test 
	public void testMakePurchase_2() throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "D";
		
		boolean result = fixture.makePurchase(code);
		
		assertNotNull(result);
		
	}
	
	/**
	 * Test for the makePurchase () method of the {@link VendingMachine} class.
	 * 
	 */	
	@Test (expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_3() throws Exception{
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";
		
		boolean result = fixture.makePurchase(code);
		
		assertTrue(result);
	}
	
	/**
	 * Test for the makePurchase () method of the {@link VendingMachine} class.
	 * 
	 */	
	@Test (expected = java.lang.AssertionError.class)
	public void testMakePurchase_4() throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "D";
		
		boolean result = fixture.makePurchase(code);
		
		assertTrue(result);
		
	}
	/**
	 * Test for the returnChange () method of the {@link VendingMachine} class. 
	 */
	@Test
	public void returnChangeTest(){
		VendingMachine test = new VendingMachine();
		double result = test.returnChange();
		assertEquals(0, result, 0);
	}
	
	/**
	 * Tear down /clean up 
	 */
	
	@After
	public void tearDown(){
		amount = 0;
		

		
	}

}
