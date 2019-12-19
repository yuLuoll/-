package test_2;

import java.util.Scanner;

public class Exercise_do
{
	public static void main(String[] args) 
	{
		int s1;
		Exercise_2 ex = new Exercise_2();
		System.out.println("---- 请输入序号选择题型 ----");
		System.out.println("---- 1.生成加法题           ----");
		System.out.println("---- 2.生成减法题           ----");
		System.out.println("---- 3.生成加减法混合题 ----");
		System.out.println("---------------------------");
		Scanner op = new Scanner(System.in);
		s1 = op.nextInt();
		if(s1==1)
		{
			System.out.println("---- 生成50道加法习题 ----");
			ex.generateAdditionExercise(50);
			ex.formattedDisplay(5);
		}
		else if(s1==2)
		{
			System.out.println("---- 生成50道减法习题 ----");
			ex.generateSubstractExercise(50);
			ex.formattedDisplay(5);
		}
		else if(s1==3)
		{
			System.out.println("----生成50道加减法习题 ----");
			ex.generateBinaryExercise(50);
			ex.formattedDisplay (5);
		}
		
	}
}