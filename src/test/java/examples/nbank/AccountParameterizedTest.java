package examples.nbank;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;


/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @author admin
 * @see Account
 */
@RunWith(Parameterized.class)
public class AccountParameterizedTest {
    String name;
    String ssn;
    int initial_balance;
    int balance;

    public AccountParameterizedTest(String name, String ssn, int initial_balance, int balance) {
        this.name = name;
        this.ssn = ssn;
        this.initial_balance = initial_balance;
        this.balance = balance;
    }

    // Parasoft Jtest UTA: Initialize test parameters
    @Parameters(name = "Run {index}: name={0}, ssn={1}, initial_balance={2}, balance={3}")
    public static Iterable<Object[]> data() throws Throwable {
        return Arrays.asList(new Object[][]{{null, null, 0, 0}
                , {"john", "123-45-6789", 1, 1}
                , {" ", " ", -1, -1}
                , {"hello world", "hello world", -2147483648, -2147483648}
                , {"01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", 2147483647, 2147483647}
        });
    }

    /**
     * Parasoft Jtest UTA: Test for setBalance(int)
     *
     * @author admin
     * @see Account#setBalance(int)
     */
    @Test
    public void testSetBalance() throws Throwable {
        Customer customer = new Customer(name, ssn);
        Account underTest = new Account(customer, initial_balance);

        underTest.setBalance(balance);

    }
}
