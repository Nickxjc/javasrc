package testing;

import junit.framework.*;

/** A simple test case for Person */
public class PersonTest extends TestCase {

	public void testNameConcat() {
		Person p = new Person("Ian", "Darwin");
		String f = p.getFullName();
		assertEquals("Name concatenation", "Ian Darwin", f);
	}

}
