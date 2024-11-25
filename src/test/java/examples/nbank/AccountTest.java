package examples.nbank;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @author admin
 * @see Account
 */
public class AccountTest {
    /**
     * Parasoft Jtest UTA: Test for isOverdrawn(int)
     *
     * @author admin
     * @see examples.nbank.Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn() throws Throwable {
        // Given
        Customer customer = null; // UTA: default value
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 0; // UTA: default value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNull(underTest.getCustomer());
        assertEquals(0, underTest.getBalance());
        assertEquals("silver", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testIsOverdrawn()
     * To cover the code, the value of the 'balance' variable has been modified to '-1'.
     *
     * @author admin
     * @see Account#isOverdrawn(int)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIsOverdrawn2() throws Throwable {
        // Given
        String name = "name"; // UTA: default value
        String ssn = "ssn"; // UTA: default value
        Customer customer = new Customer(name, ssn);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = -1; // UTA: modified value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNull(underTest.getCustomer());
        assertEquals(0, underTest.getBalance());
        assertEquals("silver", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testIsOverdrawn()
     * To cover the code, the value of the 'balance' variable has been modified to '-1'.
     *
     * @author admin
     * @see Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn3() throws Throwable {
        // Given
        Customer customer = mock(Customer.class);
        String getSSNResult = "getSSNResult"; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        String getNameResult = "getNameResult"; // UTA: default value
        when(customer.getName()).thenReturn(getNameResult);
        int initial_balance = 0; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = -1; // UTA: modified value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNotNull(underTest.getCustomer());
        assertEquals(0, underTest.getBalance());
        assertEquals("silver", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testIsOverdrawn3()
     * To cover the code, the value of the 'balance' variable has been modified to '5000'.
     *
     * @author admin
     * @see Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn4() throws Throwable {
        // Given
        Customer customer = mock(Customer.class);
        String getNameResult = "getNameResult"; // UTA: default value
        when(customer.getName()).thenReturn(getNameResult);
        String getSSNResult = "getSSNResult"; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        int initial_balance = 5000; // UTA: modified value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = -1; // UTA: modified value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNotNull(underTest.getCustomer());
        assertEquals(5000, underTest.getBalance());
        assertEquals("gold", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testIsOverdrawn4()
     * To cover the code, the value of the 'balance' variable has been modified to '10000'.
     *
     * @author admin
     * @see Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn5() throws Throwable {
        // Given
        Customer customer = mock(Customer.class);
        String getNameResult = "getNameResult"; // UTA: default value
        when(customer.getName()).thenReturn(getNameResult);
        String getSSNResult = "getSSNResult"; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        int initial_balance = 10000; // UTA: modified value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = -1; // UTA: modified value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNotNull(underTest.getCustomer());
        assertEquals(10000, underTest.getBalance());
        assertEquals("platinum", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testIsOverdrawn5()
     * To cover the code, the value of the 'balance' variable has been modified to '-500'.
     *
     * @author admin
     * @see Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn6() throws Throwable {
        // Given
        Customer customer = mock(Customer.class);
        String getNameResult = "getNameResult"; // UTA: default value
        when(customer.getName()).thenReturn(getNameResult);
        String getSSNResult = "getSSNResult"; // UTA: default value
        when(customer.getSSN()).thenReturn(getSSNResult);
        int initial_balance = 10000; // UTA: modified value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = -500; // UTA: modified value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for this instance of Account
        assertNotNull(underTest.getCustomer());
        assertEquals(10000, underTest.getBalance());
        assertEquals("platinum", underTest.getStatus());

        // Then
        // assertFalse(result);
    }

    /**
     * Parasoft Jtest UTA: Test for setBalance(int)
     *
     * @author admin
     * @see examples.nbank.Account#setBalance(int)
     */
    @Test
    public void testSetBalance() throws Throwable {
        // Given
        Customer customer = null; // UTA: default value
        int initial_balance = 1; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 1; // UTA: default value
        underTest.setBalance(balance);

    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testSetBalance()
     * To cover the code, the value of the 'balance' variable has been modified to '5000'.
     *
     * @author admin
     * @see Account#setBalance(int)
     */
    @Test
    public void testSetBalance2() throws Throwable {
        // Given
        Customer customer = null; // UTA: default value
        int initial_balance = 1; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 5000; // UTA: modified value
        underTest.setBalance(balance);

    }

    /**
     * Parasoft Jtest UTA: Test cloned from
     * examples.nbank.AccountTest#testSetBalance2()
     * To cover the code, the value of the 'balance' variable has been modified to '10000'.
     *
     * @author admin
     * @see Account#setBalance(int)
     */
    @Test
    public void testSetBalance3() throws Throwable {
        // Given
        Customer customer = null; // UTA: default value
        int initial_balance = 1; // UTA: default value
        Account underTest = new Account(customer, initial_balance);

        // When
        int balance = 10000; // UTA: modified value
        underTest.setBalance(balance);

    }
}
