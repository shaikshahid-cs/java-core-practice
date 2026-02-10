import java.util.*;
public class Main
{
	public static void cu(int a[],int n,int r,int index,int data[],int i){
	    if(index==r){
	        for(int j=0;j<r;j++){
	            System.out.print(data[j]+" ");
	        }
	        System.out.println();
	        return;
	    }
	    if(i>=n) return;
	    data[index]=a[i];
	    cu(a,n,r,index+1,data,i+1);
	    cu(a,n,r,index,data,i+1);
	}
	public static void c(int a[],int n,int r){
	    int data[]=new int[r];
	    cu(a,n,r,0,data,0);
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++) a[i]=sc.nextInt();
	    int r=sc.nextInt();
	    c(a,n,r);
	}
}
