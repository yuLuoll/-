package cbsc.cha3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExerciseSheet_3_3_2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain(String[] args) 
	{
		Exercise_3_1 output = new Exercise_3_1();
		if(output.formateAndDisplay ())
			fail("输出功能未实现");
	}

}
