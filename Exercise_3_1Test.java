package cbsc.cha3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise_3_1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerateBinaryExercise() 
	{
		BinaryOperation_3_1 input = new BinaryOperation_3_1();
		if(input.generateBinaryOperation() == 0)
			fail("功能未实现");
	}

	@Test
	public void testGenerateAdditionExercise() 
	{
		BinaryOperation_3_1 input = new BinaryOperation_3_1();
		if(input.generateBinaryOperation() == 0)
			fail("功能未实现");
	}

	@Test
	public void testGenerateSubstractExercise() 
	{
		BinaryOperation_3_1 input = new BinaryOperation_3_1();
		if(input.generateBinaryOperation() == 0)
			fail("功能未实现");
	}

}
