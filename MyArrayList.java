package ArrayList;

public class MyArrayList 
{
	int index=0;
	int size=5;
	int [] a=new int[size];
	public MyArrayList(int size) 
	{
		a=new int[size];
	}
	void add(int num)
	{
		if(index>=a.length)
		{
			System.out.println("new array");
			int size=(int) (1.75*a.length);
			int [] b=new int[size];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			a=b;
		}
		a[index++]=num;
	}
	void print()
	{
		for (int i = 0; i < index; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
}
