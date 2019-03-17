import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayWithInheritance
{
		PlayWithInheritance pl = new PlayWithInheritance();
		
	@Test
	public void test_PlayWithInheritance()
	{
		
		assertEquals("Die", PlayWithInheritance.testStatic());
	}


}