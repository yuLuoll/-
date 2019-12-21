package test_3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvReader;
public class Correction {
	public static void main(String[] args) {
		ArrayList<String[]>ans1=new ArrayList<String[]>();
		ArrayList<String[]>ans2=new ArrayList<String[]>();
		int fraction=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要批改的题号 ");
		int t=sc.nextInt();
		sc.close();
		try {
			//读入练习文件
			CsvReader reader1 = new CsvReader("D:\\exercises\\practice\\练习题"+t+".csv",',',Charset.forName("gb2312"));
			reader1.readHeaders();
			while(reader1.readRecord()){
				ans1.add(reader1.getValues());
			}
			reader1.close();
			//读入答案文件
			CsvReader reader2 = new CsvReader("D:\\exercises\\answer\\答案"+t+".csv",',',Charset.forName("gb2312"));
			reader2.readHeaders();
			while(reader2.readRecord()){
				ans2.add(reader2.getValues());
			}
			reader2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//批改
		for (int i = 0; i < ans1.size(); i++) {
			if(ans1.get(i)[1] == ans2.get(i)[1]) {
				ans1.get(i)[0]+="对";	
				fraction+=2;
			}else {
				ans1.get(i)[0]+="错";	
			}
		}
		String[] Fraction={"总分："+fraction};
		ans1.add(Fraction);
		new Write().write("D:\\exercises\\correction\\批改"+t+".csv", ans1);
		System.out.println("批改成功");
	}
	
}