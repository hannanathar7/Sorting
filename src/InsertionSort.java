import java.util.*;
public class InsertionSort {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			int currInd=i;
			while(currInd>0 && a[currInd]<a[currInd-1])
			{
				int temp=a[currInd];
				a[currInd]=a[currInd-1];
				a[currInd-1]=temp;
				currInd--;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		sc.close();
	}
}
