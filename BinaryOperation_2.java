package test_2;

import java.util.Random;
public abstract class BinaryOperation_2 
{
    static final int UPPER = 100;
	static final int LOWER = 0;
	private int left_operand=0, right_operand=0;
	private char operator='+';
  	private int value=0;
  	//不是构造器
	protected void generateBinaryOperation(char anOperator)
{
	    int left, right, result;
	    Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
   			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		} while (!(checkingCalculation(result)));
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		value = result;	
	}
    abstract boolean checkingCalculation(int anInteger);
    abstract int calculate(int left, int right);
   
	public int getLeftOperand(){return left_operand;}
	public int getRightOperand(){return right_operand;}
	public char getOperator(){return operator;}
	public int getResult(){return value;}

	public boolean equals (BinaryOperation_2 anOperation) 
	{  // 要使用 getOperator()
		return 	left_operand == anOperation.getLeftOperand() &
				right_operand == anOperation.getRightOperand() &
				operator == anOperation.getOperator();			
	}
	public String toString()
	{
		return ""+left_operand+getOperator()+right_operand;
	}
	public String asString()
	{
		return toString()+"=";
	}
	public String fullString()
	{
		return toString()+"="+getResult();
	}
	
	
}