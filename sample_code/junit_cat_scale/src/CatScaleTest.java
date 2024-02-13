import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;

import org.mockito.*;

public class CatScaleTest {
    @Test
    public void testOverweight() {
		Cat mockCat = Mockito.mock(Cat.class);
		when(mockCat.getWeight()).thenReturn(80);

		CatScale catScale = new CatScale();
		String result = catScale.report(mockCat);

		assertEquals("Overweight", result);
    }
	/**
	 * Test case for String report(Cat cat).
	 * Preconditions: A new CatScale is created and assigned to "scale".
	 *                A new Cat weighing 80 pounds is created and assigned to "cat".
	 * Execution steps: Call scale.report(cat).
	 * Postconditions: Return value is "Overweight".
	 *                 cat.getWeight() has been called.
	 */
	@Test
	public void testReport() {
		CatScale scale = new CatScale();
		Cat cat = Mockito.mock(Cat.class);
		Mockito.when(cat.getWeight()).thenReturn(80);
		String ret = scale.report(cat);
		assertEquals("80 pound cat not reported as overweight", "Overweight", ret);
		Mockito.verify(cat, Mockito.atLeastOnce()).getWeight();
	}
}
