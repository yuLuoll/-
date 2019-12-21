package test_3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.csvreader.CsvReader;

public class Practise {
	public static void main(String[] args) {
		int s1=0;
		ArrayList<String[]> ans = new ArrayList<String[]>();
		System.out.println("请输入选择的题号");
		Scanner op=new Scanner(System.in);
		int t=op.nextInt();
		System.out.println("第"+t+"套题");
		try {
			//读入文件
			CsvReader reader = new CsvReader("D:\\exercises\\exercise\\练习题"+t+".csv",',',Charset.forName("gb2312"));
			reader.readHeaders();
			while(reader.readRecord()){
				ans.add(reader.getValues());
			}
			reader.close();
			
			Scanner sc=new Scanner(System.in);
			for(int r = 0 ; r < ans.size(); r ++ ){
				for(s1=0;s1<ans.get(r).length;s1++){
				String cell = ans.get(r)[s1];
				System.out.print(cell);
				}
				if(ans.get(r)[1].endsWith("=")) {
					String s=sc.next();
					ans.get(r)[1]+=s;
					new Write().write("D:\\exercises\\practice\\练习题" + t + ".csv", ans);//存储到练习题文件	
				}else {
					System.out.println();
				}
			}
			sc.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}