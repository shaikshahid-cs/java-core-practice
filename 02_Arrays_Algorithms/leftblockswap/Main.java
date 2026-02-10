import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int r=sc.nextInt();
		if(r>n) r=r%n;
		reverse(a,0,n-1);
		reverse(a,0,n-r-1);
		reverse(a,n-r,n-1);
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
	public static void reverse(int a[],int i,int j){
	    while(i<j){
	        int temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	        i++;
	        j--;
	    }
	}
}
