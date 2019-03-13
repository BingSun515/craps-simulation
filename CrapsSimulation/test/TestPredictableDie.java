import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPredictableDie
{
		private PredictableDie pd;
		

	@Before
	public void setUp()throws Exception
	{
		int[] init_values = new int[] { 3, 2, 1 };
		pd = new PredictableDie(init_values);
	}
	
	@Test
	public void test_initialization_of_predictable_die()
	{
		pd.roll();
		int value = pd.getLastRoll();

		assertEquals("first value not 3", 3, value);
	}
	
	@Test
	public void test_roll_2_of_predictable_die()
	{
		pd.roll();
		assertEquals("first value not 3", 3, pd.getLastRoll());
		pd.roll();
		assertEquals("second value not 2", 2, pd.getLastRoll());

	}
	
	@Test
	public void test_roll_3_of_predictable_die()
	{
		pd.roll();
		pd.roll();
		pd.roll();
		assertEquals("third value not 1", 1, pd.getLastRoll());
	}
	
	@Test
	public void test_roll_4_of_predictable_die_with3_rolls()
	{
		pd.roll();
		pd.roll();
		pd.roll();
		pd.roll();
		assertEquals("fourth value not wrapping back to first value 3", 3, pd.getLastRoll());
	}
	@Test
	public void test_roll_5_of_predictable_die_with3_rolls()
	{
		pd.roll();
		pd.roll();
		pd.roll();
		pd.roll();
		pd.roll();
		assertEquals("fourth value not wrapping back to first value 3", 2, pd.getLastRoll());
	}
	@Test(expected=RuntimeException.class)
	public void test_null_initial_int_array()
	{
		pd = new PredictableDie(null);
		pd.roll();
	}
	
	@Test(expected=RuntimeException.class)
	public void test_empty_int_array()
	{
		pd = new PredictableDie(new int[] {});
		pd.roll();
	}
}
