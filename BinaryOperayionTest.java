package test_2;

public class BinaryOperayionTest
{
	public static void main(String[] args) 
	{
		BinaryOperation_2 bop;   
        for (int i=0; i<10; i++)
        {
        	bop = new AdditionOperation();
        	System.out.println(bop);
        }
        for (int i=0; i<10; i++)
        {
        	bop = new SubstractOperation();
        	System.out.println(bop);
        }
	}

}
