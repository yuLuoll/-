package test_2;

public class AdditionOperation extends BinaryOperation_2 
{	
	public AdditionOperation() 
	{	
		generateBinaryOperation('+');		
	}	
	boolean checkingCalculation(int anInteger)
	{
		return anInteger <= UPPER;
	}
	int calculate(int left, int right)
	{
		return left+right;
	}		
}
