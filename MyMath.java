package cbsc.cha2;
import java.util.Random;
public class MyMath 
{   static int[] arr = new int[51];
    static int[] arr2 = new int[51];
    static int[] arr3 = new int[51];
    static int[] arr4 = new int[51];
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
		System.out.println("�������50��100���ڵļӼ�����ʽ��ϰ��");
		System.out.println("ÿ�����г���ʱ�ɵõ�һ��50�����ϰ�⼰��");
	}
	public static void getExerises()
	{//�Զ�������ʽ
		short m = 0,n = 0,ov = 0;
		int i,l;
		char o = '+';
		Random random = new Random();
		for(i = 0;i < 50;)
		{
			ov = (short) random.nextInt(2);
			m = (short) random.nextInt(101);
			n = (short) random.nextInt(101);
			for(l=0;l<=i;l++)
			{
				if(m==arr[l]&&n==arr2[l])
					{
					break;
					}
				if(m==arr2[l]&&n==arr[l])
					{
					break;
					}
			}
			if (ov==1)
			{
				o = '+';
				if(m + n <= 100)
				{
					arr[l] = m;
					arr2[l] = n;
					arr3[l] = ov;
					arr4[l] = m + n;
				}
			}
			else
			{
				o = '-';
				if(m - n >=0&&n - m>=0)
				{
					arr[l] = m;
					arr2[l] = n;
					arr3[l] = ov;
					arr4[l] = Math.abs(m-n);
				}
			}
			if(i==l)
				i++;
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

