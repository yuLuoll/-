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
			String path1 = "D:\\exercises\\exercise\\练习题" + t + ".csv";
			String path2 = "D:\\exercises\\answer\\答案" + t + ".csv";
			//生成15套加法习题、15套减法习题、20套加减混合习题
			if(t < 15)
				e.generateBinaryExercise(50);
			else if(15 <t && t < 30) 
				e.generateAdditionExercise(50);
			else 
				e.generateSubstractExercise(50);
			con.as(e, list);//转化算式
			new Write().write(path1, list);//写入习题文件
			list.clear();
			con.full(e, list);//转化算式+答案
			new Write().write(path2, list);//写入习题答案文件
			list.clear();
			e.clear();
		}
	}
}