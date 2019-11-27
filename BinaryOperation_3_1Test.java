package cbsc.cha3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperation_3_1Test 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void testGenerateAdditionOperation() 
	{
		BinaryOperation_3_1 number = new BinaryOperation_3_1();
		if(number.getLeftOperand() > 0 && number.getLeftOperand() < 100)
		{
			if(number.getRightOperand() > 0 && number.getRightOperand() <100)
			{
				if(number.getResult() > 0 && number.getResult() <100)
					fail("this is ok");
				else
					fail("结果不符合标准");
			}
			else
				fail("过程数不符合标准");
		}
		else
			fail("过程数不符合标准");
	}

	@Test
	public void testGenerateSubstractOperation(int left,int right,int result) 
	{
		BinaryOperation_3_1 number = new BinaryOperation_3_1();
		if(number.getLeftOperand() > 0 && number.getLeftOperand() < 100)
		{
			if(number.getRightOperand() > 0 && number.getRightOperand() <100)
			{
				if(number.getResult() > 0 && number.getResult() <100)
					fail("this is ok");
				else
					fail("结果不符合标准");
			}
			else
				fail("过程数不符合标准");
		}
		else
			fail("过程数不符合标准");
	}

	@Test
	public void testGenerateBinaryOperation(int left,int right,int result) 
	{
		BinaryOperation_3_1 number = new BinaryOperation_3_1();
		if(number.getLeftOperand() > 0 && number.getLeftOperand() < 100)
		{
			if(number.getRightOperand() > 0 && number.getRightOperand() <100)
			{
				if(number.getResult() > 0 && number.getResult() <100)
					fail("this is ok");
				else
					fail("结果不符合标准");
			}
			else
				fail("过程数不符合标准");
		}
		else
			fail("过程数不符合标准");
	}
}
