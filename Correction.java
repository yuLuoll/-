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
		System.out.println("������Ҫ���ĵ���� ");
		int t=sc.nextInt();
		sc.close();
		try {
			//������ϰ�ļ�
			CsvReader reader1 = new CsvReader("D:\\exercises\\practice\\��ϰ��"+t+".csv",',',Charset.forName("gb2312"));
			reader1.readHeaders();
			while(reader1.readRecord()){
				ans1.add(reader1.getValues());
			}
			reader1.close();
			//������ļ�
			CsvReader reader2 = new CsvReader("D:\\exercises\\answer\\��"+t+".csv",',',Charset.forName("gb2312"));
			reader2.readHeaders();
			while(reader2.readRecord()){
				ans2.add(reader2.getValues());
			}
			reader2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//����
		for (int i = 0; i < ans1.size(); i++) {
			if(ans1.get(i)[1] == ans2.get(i)[1]) {
				ans1.get(i)[0]+="��";	
				fraction+=2;
			}else {
				ans1.get(i)[0]+="��";	
			}
		}
		String[] Fraction={"�ܷ֣�"+fraction};
		ans1.add(Fraction);
		new Write().write("D:\\exercises\\correction\\����"+t+".csv", ans1);
		System.out.println("���ĳɹ�");
	}
	
}