package test_2;

import java.util.Random;
import java.util.ArrayList;
public class Exercise_2 extends ArrayList<BinaryOperation_2> 
{
	private static final long serialVersionUID = 3352857962919662476L;
	private BinaryOperation_2 generateOperation()
	{
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1)
		{ 
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	public void generateAdditionExercise(int operationCount)
	{
		BinaryOperation_2 anOperation;
		while (operationCount > 0 )
		{
			do {
				anOperation = new AdditionOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	public void generateBinaryExercise(int operationCount)
	{
		BinaryOperation_2 anOperation;
		while (operationCount > 0 )
		{
			do{
				anOperation = generateOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	public void generateSubstractExercise(int operationCount)
	{
		BinaryOperation_2 anOperation;
		while (operationCount > 0 )
		{
			do{
				anOperation = new SubstractOperation();
			}while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}
	
	public void formattedDisplay (int columns)
	{
		int column=1;  
		int count = 1;
		for(BinaryOperation_2 op: this) 
		{
			if (column > columns)
			{
				print("\n");
				column = 1;
			}
			print(""+count+"."+"   ");
			print(op.asString()+"\t");
			count++;
			column++;
		} 
		print("\n");
	}
	private static void print(String str)
	{
		System.out.print(str);
	}
}