package test_3;

import java.util.ArrayList;
import java.util.Random;

import test_2.Exercise_2;
public class ExerciseSheel {
	public static void main(String[] args) {
		Exercise_2 e = new Exercise_2();
		ArrayList<String[]> list = new ArrayList<String[]>();
		Conversion con=new Conversion();
		Random ran= new Random();
		for (int t = 0; t < 50; t++) {
			String path1 = "D:\\exercises\\exercise\\��ϰ��" + t + ".csv";
			String path2 = "D:\\exercises\\answer\\��" + t + ".csv";
			//����15�׼ӷ�ϰ�⡢15�׼���ϰ�⡢20�׼Ӽ����ϰ��
			if(t < 15)
				e.generateBinaryExercise(50);
			else if(15 <t && t < 30) 
				e.generateAdditionExercise(50);
			else 
				e.generateSubstractExercise(50);
			con.as(e, list);//ת����ʽ
			new Write().write(path1, list);//д��ϰ���ļ�
			list.clear();
			con.full(e, list);//ת����ʽ+��
			new Write().write(path2, list);//д��ϰ����ļ�
			list.clear();
			e.clear();
		}
	}
}