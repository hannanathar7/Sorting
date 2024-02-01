import java.util.*;

public class CountSort {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		if(map.containsKey(a[i]))
		{
			int v=map.get(a[i]);
			map.put(a[i], v+1);
			
		}
		else
			map.put(a[i],1);
		
		}
		for(Integer z:map.keySet())
		{
			int v=map.get(z);
			for(int i=1;i<=v;i++)
			{
				System.out.print(z+" ");
			}
		}
		sc.close();
	}
}