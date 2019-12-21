package test_3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import com.csvreader.CsvWriter;
public class Write {
	public void write(String path,ArrayList<String []> list) {
		try{
			CsvWriter csvWriter = new CsvWriter(path,',',Charset.forName("gb2312"));
			String[] csvHeader = {"习题集"};
			csvWriter.writeRecord(csvHeader);
			for(int i=0;i<list.size();i++){
				String [] csvContent = list.get(i);
				csvWriter.writeRecord(csvContent);
			//	csvWriter.write
			}
			csvWriter.close();
			//System.out.println("--------------------已完成写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
 