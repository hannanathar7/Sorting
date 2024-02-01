import java.util.*;
public class QuickSort {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		sc.close();
	}	
	public static void quicksort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(arr, low, high); 
  
 
            quicksort(arr, low, pi-1); 
            quicksort(arr, pi+1, high); 
        } 
    } 
	
	public static int partition(int arr[], int low, int high) 
    { 
		int n=high-low+1;
		Random rand=new Random();
		int ran=rand.nextInt(n);
		ran=ran+low;
		int t=arr[low];
		arr[low]=arr[ran];
		arr[ran]=t;
		
		int pivot = arr[low];  
        int j = low;
      
       for(int i=low+1;i<=high;i++)
       {
    	   if(arr[i]<=pivot)
    	   {
    		   j++;
    		   int temp=arr[i];
    		   arr[i]=arr[j];
    		   arr[j]=temp;
    	   }
       }
        int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
        
        return j; 
    } 
	
}