package examples.mock;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.CharBuffer;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;


/**
 * Parasoft Jtest UTA: Test class for CharacterReader
 *
 * @author admin
 * @see CharacterReader
 */
@RunWith(Parameterized.class)
public class CharacterReaderParameterizedTest {
    public CharacterReaderParameterizedTest() {
    }

    // Parasoft Jtest UTA: No automatically parameterizable values are available. Add parameters to the test and provide values in the annotation and array below, e.g. '{ 4, "str", null }'
    @Parameters(name = "Run {index}: ")
    public static Iterable<Object[]> data() throws Throwable {
        return Arrays.asList(new Object[][]{
        });
    }

    /**
     * Parasoft Jtest UTA: Test for prepareCharBuffer(Reader)
     *
     * @author admin
     * @see CharacterReader#prepareCharBuffer(Reader)
     */
    @Test
    public void testPrepareCharBuffer() throws Throwable {
        CharacterReader underTest = new CharacterReader();

        Reader reader = null; // UTA: default value
        CharBuffer result = callPrivateMethod(underTest, CharacterReader.class, "prepareCharBuffer", new Class<?>[]{Reader.class}, new Object[]{reader});

        // assertNotNull(result);
    }

    /**
     * Parasoft Jtest UTA: Helper method to invoke private method prepareCharBuffer
     */
    @SuppressWarnings("unchecked")
    private static <T> T callPrivateMethod(Object underTest, Class<?> functionClass, String methodName, Class<?>[] argumentTypes, Object[] args) {
        try {
            Method method = functionClass.getDeclaredMethod(methodName, argumentTypes);
            method.setAccessible(true);
            return (T) method.invoke(underTest, args);
        } catch (NoSuchMethodException e) {
            throw (AssertionError) new AssertionError("No such method found").initCause(e);
        } catch (IllegalAccessException e) {
            throw (AssertionError) new AssertionError("Unable to access the specified private method").initCause(e);
        } catch (SecurityException e) {
            throw (AssertionError) new AssertionError("There was a security exception when attempting to access a private method").initCause(e);
        } catch (InvocationTargetException e) {
            throw (AssertionError) new AssertionError("The private method threw an exception").initCause(e);
        }
    }
}
