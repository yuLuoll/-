package test_2;

import java.util.Scanner;

public class Exercise_do
{
	public static void main(String[] args) 
	{
		int s1;
		Exercise_2 ex = new Exercise_2();
		System.out.println("---- ���������ѡ������ ----");
		System.out.println("---- 1.���ɼӷ���           ----");
		System.out.println("---- 2.���ɼ�����           ----");
		System.out.println("---- 3.���ɼӼ�������� ----");
		System.out.println("---------------------------");
		Scanner op = new Scanner(System.in);
		s1 = op.nextInt();
		if(s1==1)
		{
			System.out.println("---- ����50���ӷ�ϰ�� ----");
			ex.generateAdditionExercise(50);
			ex.formattedDisplay(5);
		}
		else if(s1==2)
		{
			System.out.println("---- ����50������ϰ�� ----");
			ex.generateSubstractExercise(50);
			ex.formattedDisplay(5);
		}
		else if(s1==3)
		{
			System.out.println("----����50���Ӽ���ϰ�� ----");
			ex.generateBinaryExercise(50);
			ex.formattedDisplay (5);
		}
		
	}
}