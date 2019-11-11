package cbsc.cha2;
import java.util.Random;
public class MyMath 
{   static int[] arr = new int[50];
    static int[] arr2 = new int[50];
    static int[] arr3 = new int[50];
    static int[] arr4 = new int[50];
	public static void main(String[] args)
	{
		System.out.println("------------------------");
		printHeader();
		System.out.println("------------------------");
		getExerises();
		printExerises();
		System.out.println("------------------------");
		printAnswer();
	}
	public static void printHeader()
	{
		System.out.println("�������50��100���ڼӼ�����ʽ��ϰ��");
		System.out.println("ÿ�����г���ɵõ�һ��50�����ϰ��ʹ�");
	}
	public static void getExerises()
	{//�����ʽ�����浽������
		short m = 0,n = 0,ov = 0;
		int i,l;
		char o = '+';
		Random random = new Random();
		for(i = 0;i < 50;)
		{
			ov = (short) random.nextInt(2);
			m = (short) random.nextInt(101);
			n = (short) random.nextInt(101);
			for(l=0;l<i;l++)
			{
				if(m==arr[i]||n==arr2[i])
					i--;
				if(m==arr2[i]||n==arr[i])
					i--;	
			}
			if (ov==1)
			{
				o = '+';
				if(m + n <= 100)
				{//��֤��ʽ���С�ڵ���100
					arr[i] = m;
					arr2[i] = n;
					arr3[i] = ov;
					arr4[i] = m + n;
					i++;
				}
			}
			else
			{
				o = '-';
				if(m - n >=0&&n - m>=0)
				{//��֤��ʽ�����ڵ���0
					arr[i] = m;
					arr2[i] = n;
					arr3[i] = ov;
					arr4[i] = Math.abs(m-n);
					i++;
				}
			}
			
		}
		
	}	
	public static void printExerises()
	{//�����ʽ
		int i;
		
		for(i = 0;i < 50;i++)
		{
			if(i%5==0)
				System.out.print(+(i+1)+"~"+(i+5)+":\t");
			if(arr3[i]==1)
				System.out.print(+arr[i]+"+"+arr2[i]+"=\t");
			else
				System.out.print(+arr[i]+"-"+arr2[i]+"=\t");
			if((i+1)%5==0)
				System.out.print("\n");
		}
	}
	public static void printAnswer()
	{//�����
		int i;
		for(i = 0;i < 50;i++)
		{
			if(i%5==0)
				System.out.print(+(i+1)+"~"+(i+5)+":\t");	
			System.out.print(+arr4[i]+"\t");
			if((i+1)%5==0)
				System.out.print("\n");
		}
	}
}

