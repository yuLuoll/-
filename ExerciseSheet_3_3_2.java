package cbsc.cha3;

public class ExerciseSheet_3_3_2 
{
	public static void main(String[] args) 
	{
		Exercise_3_2_2 exercise1 = new Exercise_3_2_2();
		Exercise_3_2_2 exercise2 = new Exercise_3_2_2();
		Exercise_3_2_2 exercise3 = new Exercise_3_2_2();
		System.out.println("---- ����50���ӷ�ϰ�� ----");
		exercise1.generateAdditionExercise(50);
		exercise1.formattedDisplay(5);
		System.out.println("---- ����50������ϰ�� ----");
		exercise2.generateSubstractExercise(50);
		exercise2.formattedDisplay(5);
		System.out.println("----����50���Ӽ���ϰ�� ----");
		exercise3.generateBinaryExercise(50);
		exercise3.formattedDisplay (5);
	}

}