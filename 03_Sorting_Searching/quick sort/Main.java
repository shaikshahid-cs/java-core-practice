import java.util.*;
public class Main
{
	public static int partition(int a[] ,int low,int high){
	    int pivot=a[low];
	    int i=low,j=high;
	    while(i<j){
	        if(a[i]<=pivot && i<high-1) i++;
	        if(a[j]>pivot && j>low+1) j--;
	        if(i<j){
	            int temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	        }
	    }
	    int t=a[low];
	    a[low]=a[j];
	    a[j]=t;
	    return j;
	}
	public static void qs(int a[],int low,int high){
	    if(low<high){
	        int pi=partition(a,low,high);
	        qs(a,low,pi-1);
	        qs(a,pi+1,high);
	    }
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++) a[i]=sc.nextInt();
	    qs(a,0,n-1);
	    for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}
